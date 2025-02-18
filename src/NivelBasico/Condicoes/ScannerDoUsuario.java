package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("Informe a idade do ninja: ");
        int idade = caixaDeTexto.nextInt();

        System.out.println("O nome do ninja é: " + nomeDoNinja);
        System.out.println("A idade do ninja é: " + idade + "anos");

        if (idade >=18){
            System.out.println("Esse ninja por fazer missões fora da aldeia");
        } else {
            System.out.println("O ninja é muito novo");
        }




        caixaDeTexto.close();


    }


}
