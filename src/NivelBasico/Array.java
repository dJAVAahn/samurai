package NivelBasico;

public class Array {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];
        //          linha/coluna
        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][2]);

        }

        /*
        -- Array 2D
        * Array dentro de outro Array
        * Visualização passa a ser em matrizes.
         */

        }

    }

