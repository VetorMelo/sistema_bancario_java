public class ContaBancaria {
    private double saldo;
    private double chequeEspecialTotal;
    private double chequeEspecialUsado;

    public ContaBancaria(double valorInicial) {
        this.saldo = valorInicial;
        if (valorInicial <= 500) {
            this.chequeEspecialTotal = 50;
        } else {
            this.chequeEspecialTotal = valorInicial * 0.5;
        }
        this.chequeEspecialUsado = 0;
    }

public double getSaldo() {
    return saldo;
}

public double getChequeEspecialDisponivel() {
    return chequeEspecialTotal - chequeEspecialUsado;
}

public boolean estaUsandoChequeEspecial() {
    return chequeEspecialUsado > 0;
}

public void depositar(double valor) {
    if (chequeEspecialUsado > 0) {
        double taxa = chequeEspecialUsado * 0.2;
        double totalParaRepor = chequeEspecialUsado + taxa;

        if (valor >= totalParaRepor) {
            valor -= totalParaRepor;
            System.out.printf("R$ %.2f usados para cobrir cheque especial (incluindo R$ %.2f de taxa).%n", totalParaRepor, taxa);
            chequeEspecialUsado = 0;
        } else {
            chequeEspecialUsado -= (valor / 1.2);
            System.out.printf("Depósito de R$ %.2f usado parcialmente para cobrir cheque especial.%n", valor);
            return;
        }
    }
    saldo += valor;
    System.out.printf("Depósito realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
}

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            double restante = valor - saldo;
            if (restante <= getChequeEspecialDisponivel()) {
                chequeEspecialUsado += restante;
                saldo = 0;
                System.out.printf("Saque de R$ %.2f realizado usando cheque especial.%n", valor);
            } else {
                System.out.println("Saldo insuficiente e cheque especial insuficiente. Consulte a Central de atendimento para uma análise emergencial.");
            }
        }
    }

    public void pagarBoleto(double valor) {
        sacar(valor);
    }
}