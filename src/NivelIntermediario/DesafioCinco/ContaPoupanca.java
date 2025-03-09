package NivelIntermediario.DesafioCinco;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositarSaldo(double valor) {
        if(valor > 0) {
         double valorComTaxaDeDeposito = valor - valor * 0.01;
         //valor = valor - valor * 0.01; // dedução de 1%
         saldo += valorComTaxaDeDeposito; // adiciona o saldo
         System.out.println("Depósito realizado. Novo saldo: " + saldo);
         } else {
            System.out.println("Valor inválido!");
        }
    }
}


