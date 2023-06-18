package cursojava.executavel;

public class Matrizes {

    public static void main(String[] args) {

        int notas[][] = new int[2][3];

        notas[0][0] = 80;
        notas[0][1] = 90;
        notas[0][2] = 70;

        notas[1][0] = 40;
        notas[1][1] = 60;
        notas[1][2] = 30;

        System.out.println(notas);

        for (int poslinha = 0; poslinha < notas.length; poslinha++) {

            for (int poscol = 0; poscol < notas[poslinha].length; poscol++) {
                System.out.println("Valor da Matriz " + notas[poslinha][poscol]);
            }

        }

    }

}
