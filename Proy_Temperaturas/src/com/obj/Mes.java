package com.obj;

public class Mes {

    private int tMaxima;
    private int tMinima;
    private float tMedia;
    private String mes;

    public Mes(String mes){
        setMes(mes);
    }

    public String getMes() {
        return this.mes;
    }
    protected void setMes(String mes) {
        this.mes = mes;
    }

    public int getTMaxima() {
        return this.tMaxima;
    }
    protected void setTMaxima(int tMaxima) {
        this.tMaxima = tMaxima;
    }

    public int getTMinima() {
        return this.tMinima;
    }
    protected void setTMinima(int tMinima) {
        this.tMinima = tMinima;
    }

    public int getTMedia() {
        return this.tMedia;
    }
    protected void setTMedia(int tMedia) {
        this.tMinima = tMinima;
    }
    
    public float CalculaTMedia(String mes){
        tMedia = setTMedia(getTMaxima() / getTMinima());
        return tMedia;
    }
    
}
