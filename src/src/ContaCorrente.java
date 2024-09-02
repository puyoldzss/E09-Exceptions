public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }


    @Override
    public double calcularTaxas() {
        return this.getDono().calcularTaxas();
    }

    @Override
    public void setLimite(double limite) {
        if (limite < -100 || limite > 1500) {
            throw new IllegalArgumentException("Erro: Limite fora da faixa permitida para Conta Corrente.");
        }
        super.limite = limite;
    }

}
