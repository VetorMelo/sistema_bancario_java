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


        }

    }
}