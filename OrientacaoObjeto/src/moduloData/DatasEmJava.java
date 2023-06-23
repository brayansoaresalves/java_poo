package moduloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
        System.out.println("Calendar em dia do Mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar -> Dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) -1));
        System.out.println("Calendar -> Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Calendar -> Minuto do dia: " + calendar.get(Calendar.MINUTE));
        System.out.println("Calendar -> Segundos dos dia: " + calendar.get(Calendar.SECOND));
        System.out.println("Calendar -> Ano:  " + calendar.get(Calendar.YEAR));
        
        Date date = new Date();
        System.out.println("Data em milisegundos: " + date.getTime());
        System.out.println("Dia do Mês: " + date.getDate());
        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Hora do dia: " + date.getHours());
        System.out.println("Minutos: " + date.getMinutes());
        System.out.println("Segundos: " + date.getSeconds());
        System.out.println("Ano: " + (date.getYear() + 1900));

        /* ------------------------- Simple Date Format ----------------------------- */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data atual em formato padrão e String: " + simpleDateFormat.format(date));
        System.out.println("Calendar -> Data atual em formato padrão e String: " + simpleDateFormat.format(calendar.getInstance().getTime()));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Data atual em formato para banco de dados e String " + simpleDateFormat.format(date));
        System.out.println("Calendar -> Data atual em formato para banco de dados e String " + simpleDateFormat.format(calendar.getTime()));

        try {
            System.out.println(simpleDateFormat.parse("1987-10-18 20:10:20"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println(simpleDateFormat.parse("23/06/2023"));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
