public class Pagamento {

    private float valorTotal;

    public float getValorTotal() {
        return valorTotal;
    }

    public void realizarPagamento(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valorTotal = calculadora.calcular(new OperacaoSomar());
    }

    public void reverterPagamento(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valorTotal = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirPagamento(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valorTotal = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarPagamento(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valorTotal = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaPagamento(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valorTotal = calculadora.calcular(new OperacaoMedia());
    }
}