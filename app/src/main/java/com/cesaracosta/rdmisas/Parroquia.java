package com.cesaracosta.rdmisas;


class Parroquia {

   private int _id;
    private String nombre;
    private String sector;
    private String horario;
    private double latitud;
    private double longitud;

    // Setter Methods

    void setID(int id){
        this._id = id;
    }

    void setNombre(String name){
        this.nombre = name;
    }

    void setSector(String sector) {
        this.sector = sector;
    }

    void setHorario(String horario) {
        this.horario = horario;
    }

    void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    // Getter Methods

    int getID() {
        return _id;
    }

    String getNombre() {
        return nombre;
    }

    String getSector() {
        return sector;
    }

    String getHorario() {
        return horario;
    }

    double getLatitud() {
        return latitud;
    }

    double getLongitud() {
        return longitud;
    }

}
