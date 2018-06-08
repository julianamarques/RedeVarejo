package helpers;

import interfaces.Desconto;

public class DescontoFidelidade implements Desconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.05;
    }
}
