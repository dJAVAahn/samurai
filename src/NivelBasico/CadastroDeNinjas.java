package NivelBasico;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array
        int NUMERO_MAX = 5; // limitador
        String[] ninjas = new String[NUMERO_MAX];

        // contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            // menu
            System.out.println("==== Menu Ninja ====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX){
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = sc.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados ++;
                        System.out.println("Ninja cadastrado com sucesso.");
                    } else {
                        System.out.println("A lista de ninjas está cheia, impossível cadastrar um novo ninja.");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("===== Lista de ninjas ======");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                        break;
                    }
                case 3:
                    System.out.println("Estamos saindo do programa...Aguarde");
                    break;

                default:
                    System.out.println("Essa opção não é válida.");
                    break;

            }
        }



        sc.close();
    }
}
