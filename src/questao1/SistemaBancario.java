package questao1;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do titular:");
        String titular = scanner.nextLine();

        ContaBancaria conta = null;

        if (escolha == 1) {
            conta = new ContaCorrente(titular);
        } else if (escolha == 2) {
            System.out.println("Digite a taxa Selic atual:");
            double selic = scanner.nextDouble();
            conta = new ContaPoupanca(titular, selic);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        boolean sair = false;

        while (!sair) {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir dados da conta");
            if (conta instanceof ContaPoupanca) {
                System.out.println("4. Calcular rendimento");
            }
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a depositar:");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar:");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.exibirDados();
                    break;
                case 4:
                    if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).calcularRendimento();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
