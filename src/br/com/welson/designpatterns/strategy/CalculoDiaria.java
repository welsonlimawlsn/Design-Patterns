package br.com.welson.designpatterns.strategy;

import static br.com.welson.designpatterns.util.DataUtil.HORA;

public class CalculoDiaria implements CalculoValor {

    private double valorDiaria;

    public CalculoDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public double calcular(long periodo, Veiculo veiculo) {
        return valorDiaria * Math.ceil(periodo / HORA);
    }
}
