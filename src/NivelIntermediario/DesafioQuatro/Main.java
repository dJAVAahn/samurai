package NivelIntermediario.DesafioQuatro;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Tenten = new NinjaBasico("Tenten", 13, "Armas",TipoHabilidade.TAIJUTSU);
        Tenten.mostrarInformacoes();
        Tenten.executarHabilidade();

        System.out.println();

        NinjaAvancado Jiraya = new NinjaAvancado("Jiraya", 30, "Rasengan","Modo Eremita",TipoHabilidade.NINJUTSU);
        Jiraya.mostrarInformacoes();
        Jiraya.executarHabilidade();
    }
}
