package com.cesaracosta.rdmisas;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.io.IOException;


class TestAdapter {

    private static final String TAG = "DataAdapter";
    private static final String TABLE_Name = "parroquiaslista";

    private SQLiteDatabase mDb;
    private DataBaseHelper mDbHelper;

    TestAdapter(Context context)
    {
        mDbHelper = new DataBaseHelper(context);
    }

    void createDatabase() throws SQLException
    {
        try
        {
            mDbHelper.createDataBase();
        }
        catch (IOException mIOException)
        {
            Log.e(TAG, mIOException.toString() + "  UnableToCreateDatabase");
            throw new Error("UnableToCreateDatabase");
        }
    }

    public void open() throws SQLException
    {
        try
        {
            mDbHelper.openDataBase();
            mDbHelper.close();
            mDb = mDbHelper.getReadableDatabase();
        }
        catch (SQLException mSQLException)
        {
            Log.e(TAG, "open >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }

    void close()
    {
        mDbHelper.close();
    }

    Cursor getTestData()
    {
        try
        {
            String sql ="SELECT * FROM " + TABLE_Name;

            Cursor mCur = mDb.rawQuery(sql, null);
            if (mCur!=null)
            {
                mCur.moveToNext();
            }
            return mCur;
        }
        catch (SQLException mSQLException)
        {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }

 /*  public List getParroquiasNombreFromDB(){

        try
        {
            String sql ="SELECT nombre FROM " + TABLE_Name;

            Cursor mCur = mDb.rawQuery(sql, null);
            String parroquiaNombre = "";
            List <String> parroquiaNombres = new ArrayList<String>();
            int ind = 0;

            if (mCur!=null)
            {
                mCur.moveToFirst();
               do {
                   parroquiaNombre = mCur.getString(ind);
                   parroquiaNombres.add(parroquiaNombre);

                   } while (mCur.moveToNext());
                }

            mCur.close();

            return parroquiaNombres;
        }
        catch (SQLException mSQLException)
        {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }

    }*/


}
