package questao1;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo atual: R$ " + saldo);
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public abstract void exibirDados();
}
