import java.util.Scanner;

public class Main {
    public static void main(string[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DA CONTA BANCÁRIA ===");
        System.out.println(" Informe o valor depositado na criação da conta: R$ ");
        double valorInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(valorInicial);
        int opcao;

    }
}