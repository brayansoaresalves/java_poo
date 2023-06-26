package moduloData;

import java.time.LocalDate;

public class DataemJava7 {

     public static void main(String[] args) {
        
        LocalDate database = LocalDate.parse("2021-10-05");

        /*System.out.println("Mais 5 dias: " + (database = database.plusDays(5)));
        System.out.println("Mais 5 semanas: " + (database = database.plusWeeks(5)));
        System.out.println("Mais 5 anos: " + (database = database.plusYears(5)));
        System.out.println("Mais 5 meses: " + (database = database.plusMonths(5)));

        System.out.println("Menos um ano: " + (database = database.minusYears(1)));
        System.out.println("Menos 1 mes: " + (database = database.minusMonths(1)));
        System.out.println("Menos 1 semana: " + (database = database.minusWeeks(1)));
        System.out.println("Menos 1 dia: " + (database = database.minusDays(1)));*/

        for (int parcela = 1; parcela <= 12; parcela++){
            System.out.println("data de vencimento da " + parcela + "° : " + database.plusMonths(parcela));
        }

     }

}
