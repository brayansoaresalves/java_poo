package moduloData;

import java.time.LocalDate;
import java.time.Period;

public class DataemJava6 {

    public static void main(String[] args) {

        LocalDate dataAntiga = LocalDate.of(2010, 3, 7);
        
        LocalDate dataNova = LocalDate.of(2021, 7, 4);

        System.out.println("Data antiga é maior do que data nova: " + dataAntiga.isAfter(dataNova));

        System.out.println("Data antiga é menor do que data nova: " + dataAntiga.isBefore(dataNova));

        System.out.println("Data antiga é  igual a data nova: " + dataAntiga.isEqual(dataNova));

        Period periodo = Period.between(dataAntiga, dataNova);

        System.out.println("Quantos dias: " + periodo.getDays());

        System.out.println("Quantos Meses: " + periodo.getMonths());

        System.out.println("Quantos anos: " + periodo.getYears());
    }
    
}
