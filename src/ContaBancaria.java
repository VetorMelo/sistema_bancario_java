public class ContaBancaria {
    private double saldo;
    private double chequeEspecialTotal;
    private double chequeEspecialUsado;

    public ContaBancaria(double valorInicial) {
        this.saldo = valorInicial;
        if (valorInicial <= 500) {
            this.chequeEspecialTotal = 50;
        }else {
            this.chequeEspecialTotal = valorInicial * 0.5;
        }
        this.chequeEspecialTotal = valorInicial * 0.5;
    }
    this.chequeEspecialUsado = 0;
}

public double getSaldo() {
    return saldo;
}