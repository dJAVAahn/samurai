package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    int idade;
    String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    // metodo geral
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de combate.");
    }
}

