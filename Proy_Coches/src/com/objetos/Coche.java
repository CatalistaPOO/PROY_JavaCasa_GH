package com.objetos;

public class Coche {
    //PPROPIEDADES
    private String modelo;
    private int velocidad;
    protected int velocidadMaxima;
    public enum marcaCoches {FERRARI, PORSCHE, SEAT, BMW};
    private marcaCoches marca;
    private boolean arrancado;

    //CONSTRUCTOR
    public Coche(){
        velocidad = 0;
        velocidadMaxima = 120;
        
    }


    //GETTERS SETTERS
    public marcaCoches getMarca() {
        return this.marca;
    }
    protected void setMarca(marcaCoches marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return this.velocidad;
    }
    protected void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    protected void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    //METODOS DE CLASE
    public void arrancar(){
        arrancado = true;
        if (arrancado == true) {
            System.out.println("Motor encendido!!");
        }
        else{
            System.out.println("El coche ya está arrancad");
        }
    }

    public void frenar(){
        if (arrancado == true || velocidad == 0){
            int freno = velocidad -10;
            this.velocidad -= freno;
            System.out.println("Velocidad: " + this.velocidad);
        }
        else{
            System.out.println("no frenarás con el coche parado o sin arrancar");
        }
    }
    
    public void frenar(boolean para){
        if (arrancado == true || velocidad == 0){
        this.velocidad = 0;
        System.out.println("Parada en seco!! tu velocidad es: " + this.velocidad);
        }
        else{
            System.out.println("no frenarás con el coche parado o sin arrancar");
        }
    }

    public void acelerar()throws Exception{
        if ( velocidad == 0 && velocidad != velocidadMaxima -10){
                // Exception a(){
                //      System.out.println("El coche está parado, no se puede");
                // }
        }
        else{
            velocidad += 10;
            System.out.println("Velocidad: " + velocidad);
        }
    }


}  
