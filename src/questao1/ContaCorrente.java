package questao1;

public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial = 1000;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente, mesmo com cheque especial.");
            return false;
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("Conta Corrente de " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Cheque Especial disponível: R$ " + chequeEspecial);
    }
}
