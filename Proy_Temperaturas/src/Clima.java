import java.util.ArrayList;

import com.obj.Mes;

public class Clima {
    public static void main(String[] args) throws Exception {    

         ArrayList<Mes> meses = new ArrayList<Mes>();
         String[] nombreMeses = new String[]{"ENERO","FEBRERO","MARZO","ABRIL"
         ,"MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};

        // ARRAY PARA CREAR 12 MESES
        for (int i = 1; i <= 12; i++){
            Mes mes = new Mes();
            String nombre = nombreMeses[i-1];
            mes.setNombre(nombre);
            int tMaxima = mes.tRandom();
            mes.setTMaxima(tMaxima);
            int tMinima = mes.tRandom();
            mes.setTMinima(tMinima);
            meses.add(mes);
        }
        // RECORRER ARRAY PARA MOSTRAR INFORMACION DE CADA MES
        for (Mes m : meses) {
           System.out.println(m.toString());
        }
    }
}