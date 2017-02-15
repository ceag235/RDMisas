package com.cesaracosta.rdmisas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button prqRadarBtn;
        Button prqQueryBtn;
        Button prqListaBtn;

        prqListaBtn = (Button)findViewById(R.id.prqListaBtn);
        prqRadarBtn= (Button)findViewById(R.id.prqRadarBtn);
        prqQueryBtn= (Button)findViewById(R.id.prqQueryBtn);

       /* On Click Listener */

        prqListaBtn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        CargaListaView();
                    }
                }
        );

        prqRadarBtn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        CargaMapaView();
                    }
                }
        );

        prqQueryBtn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        CargaBuscarView();
                    }
                }
        );


    }


    private void CargaListaView(){
        Intent i = new Intent(this,ParroquiaLista.class);
        startActivity(i);
    }

    private void CargaBuscarView(){
        Intent i = new Intent(this,ParroquiaQuery.class);
        startActivity(i);
    }

    private void CargaMapaView(){

    }
}
