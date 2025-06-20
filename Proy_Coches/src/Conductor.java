import com.objetos.Coche;
import com.objetos.Deportivo;
import com.objetos.Coche.marcaCoches;

public class Conductor {
    public static void main(String[] args) throws Exception {
        //-----------------------------------------------------------------------------------------------------
        // Vamos a realizar una aplicación que se encargará de utilizar vehículos.
        // Tendremos dos clases: Coche y Deportivo.

        // Coche:
        // Marca: Propiedad String
        // Modelo: Propiedad String
        // Velocidad: Propiedad int
        // Velocidad Máxima: Propiedad int
        // Arrancar(): Método
        // Frenar(): Método
        // Acelerar(): Método

        // No podremos acelerar si el coche está parado.
        // Acelerar será de 20 en 20 y no podremos superar la velocidad máxima (180 maximo).
        // El conductor no puede modificar la velocidad máxima de un vehículo
        // Frenar tendrá una sobrecarga, si frenamos normal, frenamos el coche de 10 en 10 (velocidad)
        // Podremos pasar un argumento (boolean) que detendrá el coche.
        // Sobrescribimos el método toString() para poder mostrar la marca, modelo y velocidad actual del Coche


        // Deportivo:
        // Tendrá lo mismo que un Coche y además un método llamado turbo() que incrementará la velocidad en 40.
        // Acelerará de 50 en 50 y no podremos superar la velocidad máxima.(350 máximo)
        //-----------------------------------------------------------------------------------------------------

        // ACCIONES COCHE
        System.out.println("-----------------------------------------");
        System.out.println("ACCIONES COCHE:");
        System.out.println("-----------------------------------------");
        Coche coche = new Coche();
        coche.setMarca(marcaCoches.BMW); 
        coche.setModelo("I3");
        System.out.println(coche.toString());

        try {
            coche.acelerar();
        } catch (Exception e) {
            System.out.println("ERROR:Arranca el coche o no acelerarás");
        }
        coche.arrancar(true);
        coche.acelerar();
        coche.acelerar();
        coche.frenar();
        coche.frenar(false);
        coche.arrancar(false);
        
        // ACCIONES DEPORTIVO
        System.out.println("-----------------------------------------");
        System.out.println("ACCIONES DEPORTIVO");
        System.out.println("-----------------------------------------");
        Deportivo deportivo = new Deportivo();
        deportivo.setMarca(marcaCoches.PORSCHE);
        deportivo.setModelo("Carrera");
        System.out.println(deportivo.toString());

        try {
            deportivo.acelerar();
        } catch (Exception e) {
            System.out.println("ERROR:La aceleración no se ha producido");
        }
        deportivo.arrancar(true);
        deportivo.acelerar();
        deportivo.turbo(true);
        deportivo.acelerar();
        deportivo.turbo(false);
        deportivo.acelerar();
        deportivo.frenar();
        deportivo.frenar(true);
        deportivo.arrancar(false);
        System.out.println("-----------------------------------------");
    }
}