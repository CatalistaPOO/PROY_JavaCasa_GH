import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import com.obj.Mes;

public class Clima {
    public static void main(String[] args) throws Exception {    

         Scanner teclado = new Scanner(System.in);
         ArrayList<Mes> meses = new ArrayList<Mes>();
         String[] nombreMeses = new String[]{"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};

        for (int i = 1; i <= 12; i++){
            Mes mes = new Mes();
            // System.out.println("escribe nombre del mes " + i);
            // String nombre = teclado.nextLine();
            String nombre = nombreMeses[i-1];
            // System.out.println("Temperatura máxima del mes " + i);
            // int tMaxima = Integer.parseInt(teclado.nextLine());
            int tMaxima = mes.tRandom();
            // System.out.println("Temperatura mínima del mes " + i);
            // int tMinima = Integer.parseInt(teclado.nextLine());
            int tMinima = mes.tRandom();
            mes.setTMaxima(tMaxima);
            mes.setTMinima(tMinima);
            mes.setNombre(nombre);
            meses.add(mes);
        }

        for (Mes m : meses) {
           System.out.println(m.toString() );
        }
    }
}
