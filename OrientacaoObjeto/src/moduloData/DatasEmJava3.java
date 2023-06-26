package moduloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava3 {

    public static void main(String[] args) throws ParseException {

        Date datainicial =  new SimpleDateFormat("dd/MM/yyyy").parse("26/06/2022");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(datainicial);

        for (int parcela = 1; parcela <=36; parcela++){
            calendar.add(Calendar.MONTH, 1);

            System.out.println("Parcela nº " + parcela + " vencimento é em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }

        
        
    }
    
}
