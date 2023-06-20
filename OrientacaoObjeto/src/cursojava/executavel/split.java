package cursojava.executavel;

import java.util.Arrays;
import java.util.List;


public class split {

    public static void main(String[] args) {

        String texto = "Brayan, Curso java, 90, 70, 90, 100";

        String[] valoresArrays = texto.split(",");

        System.out.println("nome: " + valoresArrays[0]);

        System.out.println("curso: " + valoresArrays[1]);

        System.out.println("nota 1: " + valoresArrays[2]);

        System.out.println("nota 2: " + valoresArrays[3]);

        System.out.println("nota 3: " + valoresArrays[3]);

        System.out.println("nota 4: " + valoresArrays[4]);

        /* Convertendo um array em uma lista */

        List<String> list = Arrays.asList(valoresArrays);

        for (String lista : list) {
            System.out.println(lista);
        }

        /* Converter uma lista para um array */

        String[] conversaoArray = list.toArray(new String[6]);

        for (int pos = 0; pos < conversaoArray.length; pos++) {
            System.out.println(conversaoArray[pos]);
        }

    }

}
