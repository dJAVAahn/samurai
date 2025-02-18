package NivelIntermediario.DesafioQuatro;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    String habilidade;
    String especialidade;
    TipoHabilidade tipoHabilidade;

    public NinjaAvancado (){
    }

    public NinjaAvancado (String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Habilidade tipo: " + tipoHabilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("A habilidade " + habilidade + " está ativada");
    }
}
