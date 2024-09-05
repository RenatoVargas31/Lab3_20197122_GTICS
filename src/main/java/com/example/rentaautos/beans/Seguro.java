package com.example.rentaautos.beans;

public class Seguro {
    private int idSeguro;
    private String aseguradora;
    private String coberturaMaxima;
    private String tarifa;

    public Seguro(int idSeguro, String aseguradora, String coberturaMaxima, String tarifa) {
        this.idSeguro = idSeguro;
        this.aseguradora = aseguradora;
        this.coberturaMaxima = coberturaMaxima;
        this.tarifa = tarifa;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getCoberturaMaxima() {
        return coberturaMaxima;
    }

    public void setCoberturaMaxima(String coberturaMaxima) {
        this.coberturaMaxima = coberturaMaxima;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
}
