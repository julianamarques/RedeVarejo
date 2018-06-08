package helpers;

import interfaces.Desconto;

public class DescontoPorQtdItens implements Desconto {

    @Override
    public double calcularDesconto(double valorItem) {
        return valorItem * 0.1;
    }
}
