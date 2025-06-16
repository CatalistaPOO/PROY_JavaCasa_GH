import com.objetos.Perro;
import com.objetos.SerVivo;
import com.objetos.Perro.sizePerro;
import com.objetos.SerVivo.tipoSerVivo;

public class App {
    public static void main(String[] args) {
        //LA CLASE SerVivo OBLIGA A DEFINIR EL TIPO DE UN ENUM DEFINIDO EN SerVivo (tipoSerVivo)
        SerVivo animalillo = new SerVivo(tipoSerVivo.ANIMAL);
        SerVivo persona = new SerVivo(tipoSerVivo.HUMANO);
        SerVivo plantita = new SerVivo(tipoSerVivo.PLANTA);
        //Comprobamos objetos serVivo (animalillo, persona, plantita)
        System.out.println("animalillo es un: " + animalillo.getSerVivo());
        System.out.println("persona es un: " + persona.getSerVivo());
        System.out.println("plantita es una: " + plantita.getSerVivo());

        //LA CLASE Perro OBLIGA A DEFINIR EL TIPO DE UN ENUM DEFINIDO EN Perro (sizePerro)
        Perro mastin = new Perro(sizePerro.GRANDE);
        Perro pastorAleman = new Perro(sizePerro.MEDIANO);
        Perro chiuaua = new Perro(sizePerro.PEQUE);

        System.out.println("mastin es un: " + mastin.getSerVivo() + " de la clasificacion: " + mastin.getClass().getSimpleName() + ", de tamaño: " + mastin.getSize());
        System.out.println("pastorAleman es un: " + pastorAleman.getSerVivo() + " de la clasificacion: " + pastorAleman.getClass().getSimpleName() + ", de tamaño: " + pastorAleman.getSize());
        System.out.println("chiuaua es un: " + chiuaua.getSerVivo() + " de la clasificacion: " + chiuaua.getClass().getSimpleName() + ", de tamaño: " + chiuaua.getSize());
    }
}
