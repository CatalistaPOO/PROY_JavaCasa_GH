package com.obj;

import java.util.ArrayList;

public class Mes {

    private int tMaxima;
    private int tMinima;
    private String nombre;
    

    public int getTMaxima() {
        return this.tMaxima;
    }

    public void setTMaxima(int tMaxima) {
        this.tMaxima = tMaxima;
    }

    public int getTMinima() {
        return this.tMinima;
    }

    public void setTMinima(int tMinima) {
        this.tMinima = tMinima;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double CalculaTMediaMensual(){
        return this.tMaxima + this.tMinima / 2;
    }

    public int tRandom(){
        int minimo;
        int maximo;
        if(getNombre() == NOVIEMBRE,DICIEMBRE,ENERO,FEBRERO){
             minimo = - 70;
             maximo = 70;

        }
        // numeroAleatorio=(Math.random()∗(max−min+1))+min
        double randomValue = Math.random()*(maximo-minimo + 1) + minimo;
        return (int)randomValue;
    }

    @Override
    public String toString(){
        return "-------------------------------------------------------------" + 
                "\nMes: " + getNombre() +
                "\nTemperatura MAXIMA: " + getTMaxima() +
                "\nTemperatura MINIMA: " + getTMinima() +
                "\nTemperatura media:" + CalculaTMediaMensual() + "Cº" + 
                "\n-------------------------------------------------------------" ;
        // return "Mes:" + this.nombre + "Temperatura Maxima:" + this.tMaxima + "Temperatura mínima:" + tMinima;
    }
    
}