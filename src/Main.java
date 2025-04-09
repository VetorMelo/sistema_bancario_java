import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DA CONTA BANCÁRIA ===");
        System.out.println(" Informe o valor depositado na criação da conta: R$ ");
        double valorInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(valorInicial);
        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial disponível");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:  ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
                case 2 -> System.out.printf("Cheque especial disponível: R$ %.2f%n", conta.getChequeEspecialDisponivel());
                case 3 -> {
                    System.out.print("Informe o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                }
                case 4 -> {
                    System.out.print("Informe o valor do saque: R$ ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                }
                case 5 -> {
                    System.out.print("Informe o valor do boleto: R$ ");
                    double boleto = scanner.nextDouble();
                    conta.pagarBoleto(boleto);
                }
                case 6 -> {
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("A conta está usando o cheque especial.");
                    }else {
                        System.out.println("A conta NÃO está usando utilizando o cheque especial.");
                    }
                }
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao !=0);

        scanner.close();
    }
}