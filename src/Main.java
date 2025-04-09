import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Olá, seja bem-vindo! Vamos dar início à abertura da sua conta? ===");
        System.out.println(" Por favor, informe o valor que deseja depositar na abertura da conta R$ ");
        double valorInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(valorInicial);
        int opcao;

        do {
            System.out.println("\n=== Acesse os serviços abaixo: ===");
            System.out.println("1 - Consultar saldo na conta?");
            System.out.println("2 - Quanto posso utilizar do cheque especial?");
            System.out.println("3 - Depositar na minha conta");
            System.out.println("4 - Fazer um saque");
            System.out.println("5 - Realizar pagamento");
            System.out.println("6 - Acompanhar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:  ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
                case 2 -> System.out.printf("Você pode contar com esse limite no cheque especial: R$ %.2f%n", conta.getChequeEspecialDisponivel());
                case 3 -> {
                    System.out.print("Vamos lá! Qual valor deseja colocar na conta? R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                }
                case 4 -> {
                    System.out.print("Informe aqui o valor do seu saque: R$ ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                }
                case 5 -> {
                    System.out.print("Insira o valor do boleto para pagamento: R$ ");
                    double boleto = scanner.nextDouble();
                    conta.pagarBoleto(boleto);
                }
                case 6 -> {
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("Atenção: sua conta entrou no cheque especial.");
                    }else {
                        System.out.println("Tudo certo! Você não está usando o cheque especial.");
                    }
                }
                case 0 -> System.out.println("Saindo da conta...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao !=0);

        scanner.close();
    }
}