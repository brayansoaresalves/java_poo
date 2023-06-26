package moduloData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataemJava4 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Dia da semana: " + localDate.getDayOfWeek());
        System.out.println("Dia do Mês: " + localDate.getDayOfMonth());
        System.out.println("Dia do Ano: " + localDate.getDayOfYear());

        System.out.println("Mes: " + localDate.getMonth());
        System.out.println("Ano: " + localDate.getYear());

    }
    
}
