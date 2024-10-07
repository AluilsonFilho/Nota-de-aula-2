package questao1;

public class ContaPoupanca extends ContaBancaria {
    private double selic;

    public ContaPoupanca(String titular, double selic) {
        super(titular);
        this.selic = selic;
    }

    public void calcularRendimento() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = saldo * 0.005;
        } else {
            rendimento = saldo * 0.007 * (selic / 100);
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado. Saldo atual: R$ " + saldo);
    }

    @Override
    public void exibirDados() {
        System.out.println("Conta Poupança de " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Taxa Selic: " + selic + "%");
    }
}


