package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        int escolhaDoUsuario = sc.nextInt();
        System.out.println("Voce digitou o número: " + escolhaDoUsuario);

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuário escolheu o Naruto");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke");
                break;
            case 3:
                System.out.println("O usuário escolheu o Sakura");
                break;
            default:
                System.out.println("Voce não digitou uma resposta válida, escolha entre as opções.");
        }


        sc.close();
    }
}
