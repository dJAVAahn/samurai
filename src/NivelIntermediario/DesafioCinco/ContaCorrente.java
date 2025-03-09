package NivelIntermediario.DesafioCinco;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositarSaldo(double valor) {
        if(valor > 0) {
            saldo += valor; // adiciona o saldo
            System.out.println("Depósito realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido!");
        }

    }
}
