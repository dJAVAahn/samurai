package NivelBasico.Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 9;


        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        }else if (numeroDeMissoes >=20){
            System.out.println("Rank: Jounin");
        } else{
            System.out.println("Rank: Gennim");
        }


    }

}
