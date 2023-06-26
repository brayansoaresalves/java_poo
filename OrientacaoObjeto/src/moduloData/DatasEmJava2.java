package moduloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava2 {

    public static void main(String[] args) throws ParseException {

        //Date datapasada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");

        Long dias = ChronoUnit.YEARS.between(LocalDate.parse("2023-02-01"), LocalDate.now());

        System.out.println("Possui " + dias + " anos entre a faixa de datas.");
        
    }
    
}
