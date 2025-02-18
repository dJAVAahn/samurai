package NivelIntermediario.DesafioQuatro;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico (){
    }

    public NinjaBasico (String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;

    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Habilidade tipo: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("A habilidade " + habilidade + " está ativada.");


    }
}
