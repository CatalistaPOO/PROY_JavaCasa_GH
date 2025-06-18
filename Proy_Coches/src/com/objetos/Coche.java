package com.objetos;

public class Coche {
    //PPROPIEDADES
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;
    public enum marcaCoches {FERRARI, PORSCHE, SEAT, BMW};
    private marcaCoches marca;
    private boolean arrancado;
    private int sumaRestaVelocidad;
    private int freno = 10;

    //CONSTRUCTOR
    public Coche(){
        setVelocidad(0);
        setVelocidadMaxima(120);
        setArrancado(false);
        setMarca(marcaCoches.SEAT);
        setModelo("León");
        setSumaRestaVelocidad(20);
    }


    //GETTERS SETTERS
    public marcaCoches getMarca() {
        return this.marca;
    }
    public void setMarca(marcaCoches marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
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

    public boolean getArrancado(){
        return this.arrancado;
    }
     protected void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public int getSumaRestaVelocidad() {
        return this.sumaRestaVelocidad;
    }
    public void setSumaRestaVelocidad(int sumaRestaVelocidad) {
        this.sumaRestaVelocidad = sumaRestaVelocidad;
    }
    

    //METODOS PROPIOS
    public void arrancar(boolean onOff){

        if (onOff == true) {
            setArrancado(true);
            System.out.println("Motor encendido!!");
        }
        else{
            setArrancado(false);
            System.out.println("Motor apagado...");
            setVelocidad(0);
        }
    }

    public void frenar(){
        if (arrancado == true || getVelocidad() != 0){
            setVelocidad(getVelocidad() - freno);
            System.out.println("Frenando, velocidad:" + getVelocidad());
            
        }
        else{
            System.out.println("no frenarás con el coche parado o sin arrancar");
        }
    }
    
    public void frenar(boolean para){
        if (getVelocidad() > getSumaRestaVelocidad()){
            if(getVelocidad() > 80){
                System.out.println( "GAME OVER para tí, demasiada velocidad, ni con airbag...");
            }
            setVelocidad(0);
            System.out.println("Parada en seco!! tu velocidad es:" + getVelocidad());
        }
        else{
            setVelocidad(0);
            System.out.println("Estás parado..." + getVelocidad());
        }
    }

    public void acelerar()throws Exception{
        if ( this.arrancado == false) {
                System.out.println("No has arrancado.Velocidad:" + getVelocidad());
            }
        else{
             setVelocidad(getVelocidad() + sumaRestaVelocidad);
             if (velocidad > velocidadMaxima){
                 setVelocidad(velocidadMaxima);
                 System.out.println("Velocidad MAXIMA!!! " + getVelocidad());
             }
             else{
                 System.out.println("Velocidad: " + getVelocidad());
             }
        }
    }

     // Sobrescribimos el método toString() para poder mostrar la marca, modelo y velocidad actual del Coche
    @Override
    public String toString() {
        return ("Marca:" + this.marca + " Modelo:" + this.modelo + " Velocidad:" + this.velocidad);
    }

}  
