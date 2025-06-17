package com.objetos;

public class Deportivo extends Coche{

    //ATRIBUTOS
    private int velocidadMaximaDeportivo = 350;
    private int acelerarDeportivo = getSumaRestaVelocidad() + 40; 
    private int turbo = 40;

    //SETTERS GETTERS
    @Override
    public int getVelocidadMaxima(){
        return this.velocidadMaximaDeportivo;
    }
    @Override
    protected void setVelocidadMaxima(int velocidadMaxima){
        velocidadMaxima =  velocidadMaximaDeportivo;
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
            setVelocidad(getVelocidad() + getVelocidadMaxima());
            System.out.println(getVelocidad());
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
    }

    //METODOS PROPIOS
     // Tendrá lo mismo que un Coche y además un método llamado turbo() que incrementará la velocidad en 40.
     public void turbo(){
        setVelocidad(getVelocidad() + turbo); 
     }

}
