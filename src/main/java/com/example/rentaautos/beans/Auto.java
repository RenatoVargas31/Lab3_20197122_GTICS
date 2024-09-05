package com.example.rentaautos.beans;

public class Auto {
    private int idAuto;
    private String modelo;
    private String color;
    private String kilometraje;
    private Sede sede;
    private String costoDiario;

    public Auto(int idAuto, String modelo, String color, String kilometraje, Sede sede, String costoDiario) {
        this.idAuto = idAuto;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.sede = sede;
        this.costoDiario = costoDiario;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getCostoDiario() {
        return costoDiario;
    }

    public void setCostoDiario(String costoDiario) {
        this.costoDiario = costoDiario;
    }
}
