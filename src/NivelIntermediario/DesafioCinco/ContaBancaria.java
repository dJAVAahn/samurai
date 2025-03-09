package NivelIntermediario.DesafioCinco;

public abstract class ContaBancaria implements Conta{
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é: R$ " + saldo);
    }

    @Override
    public void depositarSaldo(double valor) {
    }
}
