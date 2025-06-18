import java.util.ArrayList;

import com.obj.Mes;

public class Clima {
    public static void main(String[] args) throws Exception {    

         ArrayList<Mes> meses = new ArrayList<Mes>();
         String[] nombreMeses = new String[]{"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};

        for (int i = 1; i <= 12; i++){
            Mes mes = new Mes();
            String nombre = nombreMeses[i-1];
            int tMaxima = mes.tRandom();
            int tMinima = mes.tRandom();
            mes.setTMaxima(tMaxima);
            mes.setTMinima(tMinima);
            mes.setNombre(nombre);
            meses.add(mes);
        }

        for (Mes m : meses) {
           System.out.println(m.toString());
        }
    }
}
