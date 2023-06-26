package moduloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManipularDatas {

    public static void main(String[] args) throws ParseException {
        
        Calendar calendar = Calendar.getInstance(); // pega a data atual 

        /*
         * 
         */

        /* Simular que a data vem do banco de dados  */
        calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));

        calendar.add(Calendar.DAY_OF_MONTH, 1);

        System.out.println("Somando o dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

        calendar.add(Calendar.MONTH, -1);

    System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

    calendar.add(Calendar.YEAR, 1);

    System.out.println("Somando o Ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

    }
    
}
