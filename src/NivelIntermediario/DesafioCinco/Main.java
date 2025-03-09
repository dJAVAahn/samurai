package NivelIntermediario.DesafioCinco;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(10,TipoConta.POUPANCA);
        contaPoupanca.depositarSaldo(5);
        contaPoupanca.consultarSaldo();

    }
}
