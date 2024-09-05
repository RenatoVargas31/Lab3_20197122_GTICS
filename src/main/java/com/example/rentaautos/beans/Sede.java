package com.example.rentaautos.beans;

public class Sede {
    private int idSede;
    private String distrito;
    private String direccion;

    public Sede(int idSede, String distrito, String direccion) {
        this.idSede = idSede;
        this.distrito = distrito;
        this.direccion = direccion;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
