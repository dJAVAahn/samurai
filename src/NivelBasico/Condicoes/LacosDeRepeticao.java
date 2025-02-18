package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        // while
        // while (condicao){tudo aqui acontece}

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        /*while (numeroDeClones <= numeroMaxDeClones) {
            numeroDeClones++; // incremento para não acontecer o loop infinito. Fundamental em while.
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }*/

        // FOR
        for (int i = 0 ; i <= numeroMaxDeClones ; i++) {
            System.out.println("O naruto esta se clonando e se clonou " + i);
        }
    }
}
