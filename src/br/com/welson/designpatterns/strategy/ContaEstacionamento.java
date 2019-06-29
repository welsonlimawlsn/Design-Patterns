package br.com.welson.designpatterns.strategy;

public class ContaEstacionamento {

    private Veiculo veiculo;
    private long inicio;
    private long fim;
    private CalculoValor calculoValor;

    public double valorConta() {
        return calculoValor.calcular(fim - inicio, veiculo);
    }

    public void setCalculoValor(CalculoValor calculoValor) {
        this.calculoValor = calculoValor;
    }
}
