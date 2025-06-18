package com.objetos;

public class Deportivo extends Coche{

    //ATRIBUTOS
    private int velocidadMaximaDeportivo = 350;
    private int acelerarDeportivo = 50; 
    private int turbo = 40;
    private boolean isTurboActive;

    //SETTERS GETTERS
    @Override
    public int getVelocidadMaxima(){
        return this.velocidadMaximaDeportivo;
    }
    @Override
    protected void setVelocidadMaxima(int velocidadMaxima){
        velocidadMaxima = velocidadMaximaDeportivo;
    }

    public int getAcelerarDeportivo() {
        return acelerarDeportivo;
    }
    protected void setAcelerarDeportivo(int acelerarDeportivo) {
        this.acelerarDeportivo = acelerarDeportivo;
    }

     public boolean getIsTurboActive() {
        return this.isTurboActive;
    }
    protected void setIsTurboActive(boolean isTurboActive) {
        this.isTurboActive = isTurboActive;
    }

    public int getTurbo() {
        return this.turbo;
    }
    protected void setTurbo(int turbo) {
        this.turbo = turbo;
    }

    @Override
     public void acelerar() throws Exception{
        if(getArrancado() == false){
             System.out.println("Mejor si arrancas para acelerar");
        }
        else{
            setVelocidad(getVelocidad() + acelerarDeportivo);
            if (getVelocidad() > getVelocidadMaxima()){
                setVelocidad(velocidadMaximaDeportivo);
                System.out.println("Velocidad MAXIMA!!! " + getVelocidad());
            }
            else{
                System.out.println("Velocidad: " + getVelocidad());
            }
        }
    }

    // CONSTRUCTORES
    public Deportivo(){
        this.setVelocidad(0);
        this.setVelocidadMaxima(velocidadMaximaDeportivo);
        this.setMarca(marcaCoches.FERRARI);
        this.setModelo("Testarosa");
        setArrancado(false);
        setSumaRestaVelocidad(50);
        setIsTurboActive(false);
        
    }

    //METODOS PROPIOS
     // Tendrá lo mismo que un Coche y además un método llamado turbo() que incrementará la velocidad en 40.
     public void turbo(boolean enableDisable){
        if (enableDisable == true){
            if (isTurboActive == false){
                setAcelerarDeportivo(acelerarDeportivo + turbo);
                setIsTurboActive(true);
                setVelocidad(getVelocidad() + turbo);
                System.out.println("Tuurbooo, Velocidad:" + getVelocidad());
            }
        }
        if (enableDisable == false){
            if(isTurboActive == true){
                setIsTurboActive(false);
                setAcelerarDeportivo(acelerarDeportivo - turbo);
                System.out.println("Turbo OFF, Velocidad:" + getVelocidad());
            }
        }
     }

}
