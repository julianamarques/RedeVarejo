package helpers;

import interfaces.Desconto;

public class DescontoPorValorCompra implements Desconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.1;
    }
}
