package com.objetos;

public class SerVivo {
    //PROPIEDADES
    public enum tipoSerVivo{ HUMANO, ANIMAL, PLANTA}//Opciones en Enum
    private tipoSerVivo serVivo;
    
    //GETTERS & SETTERS
    public tipoSerVivo getSerVivo() {
        return this.serVivo;
    }
    //Este Setter OBLIGA a definir tipoSerVivo (no puede haber serVivo que no sea elemento del enum)
    protected void setSerVivo(tipoSerVivo serVivo) {
            this.serVivo = serVivo;
    }
    
    //CONSTRUTORES (Nombre de la clase)
    public SerVivo(tipoSerVivo serVivo){
        this.serVivo = serVivo;
    }
}
