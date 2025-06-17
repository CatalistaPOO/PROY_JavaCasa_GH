package com.objetos;

public class Deportivo extends Coche{

    //ATRIBUTOS
    private int velocidadMaximaDeportivo = 350;
    private int acelerarDeportivo = getSumaRestaVelocidad() + 40; 
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
    public void setAcelerarDeportivo(int acelerarDeportivo) {
        this.acelerarDeportivo = acelerarDeportivo;
    }

     public boolean getIsTurboActive() {
        return this.isTurboActive;
    }
    public void setIsTurboActive(boolean isTurboActive) {
        this.isTurboActive = isTurboActive;
    }

    public int getTurbo() {
        return this.turbo;
    }
    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }

    @Override
     public void acelerar() throws Exception{
        if (getVelocidad() == velocidadMaximaDeportivo - (acelerarDeportivo -1)){
            System.out.println("No puedes sobrepasar la velocidad máxima");
        }
        else if(getArrancado() == false){
            System.out.println("Mejor si arrancas para acelerar");
        }
        else{
            setVelocidad(getVelocidad() + acelerarDeportivo);
            System.out.println("Acelerando!!, turbo " + getIsTurboActive() + " Velocidad:" + getVelocidad());
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
