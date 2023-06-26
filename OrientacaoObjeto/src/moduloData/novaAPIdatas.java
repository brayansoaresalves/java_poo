package moduloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class novaAPIdatas {

    public static void main(String[] args) throws ParseException {
        /*Nova api de java a partir do java 8 */

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora Atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        LocalDateTime datahoraAtual = LocalDateTime.now();
        System.out.println("A data e hora atual é: " + datahoraAtual);

        System.out.println("Data hora Atual formatada - " + datahoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

    }
    
}
