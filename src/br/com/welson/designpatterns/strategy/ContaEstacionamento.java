package br.com.welson.designpatterns.strategy;

import br.com.welson.designpatterns.util.DataUtil;

import static br.com.welson.designpatterns.util.DataUtil.DIA;
import static br.com.welson.designpatterns.util.DataUtil.HORA;

public class ContaEstacionamento {

    private Veiculo veiculo;
    private long inicio;
    private long fim;

    public double valorConta() {
        long atual = fim == 0 ? System.currentTimeMillis() : fim;
        long periodo = inicio - fim;
        if (veiculo instanceof Passeio) {
            if (periodo < 12 * HORA) {
                return 2.0 * Math.ceil(periodo / HORA);
            } else if (periodo < 15 * DIA) {
                return 26.0 * Math.ceil(periodo / DIA);
            } else {
                return 300.0 * Math.ceil(periodo / DataUtil.MES);
            }
        } else if (veiculo instanceof Carga) {
            throw new UnsupportedOperationException("Tipo Carga não implentado.");
        }
    }
}
