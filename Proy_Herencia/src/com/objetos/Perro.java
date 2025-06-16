package com.objetos;


public class Perro extends SerVivo{ 
    //ATRIBUTOS
    public enum sizePerro{GRANDE, MEDIANO, PEQUE}
    private sizePerro size;

    //GETTER Y SETTER de atributo size
    public sizePerro getSize() {
        return this.size;
    }

    protected void setSize(sizePerro size) {
        this.size = size;
    }

    //CONSTRUCTORES Perro
    public Perro(sizePerro size) {
        super(tipoSerVivo.ANIMAL);
        this.size = size;
    }
   
}
