package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // coloca tudo em caps
        System.out.println(nomeEmCaixaAlta);
        System.out.println(nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // tolowercase - em caixa baixa
        System.out.println(aldeiaEmCaixaBaixa);
        System.out.println(aldeia);
    }
}
