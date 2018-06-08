package helpers;

import models.Compra;

public class DefineDesconto {
    private static DescontoFidelidade descontoFidelidade = new DescontoFidelidade();
    private static DescontoPorValorCompra descontoPorValorCompra = new DescontoPorValorCompra();
    private static DescontoPorQtdItens descontoPorQtdItens = new DescontoPorQtdItens();

    public static double escolherDesconto(Compra compra) {
        double somaDescontosPorItem = 0;

        if (compra.calcularValorTotal() > 1000) {
            return descontoPorValorCompra.calcularDesconto(compra.calcularValorTotal());
        }

        else if (compra.getCliente().getPontuacao() > 1000) {
            return descontoFidelidade.calcularDesconto(compra.calcularValorTotal());
        }

        else {
            for (int i = 0; i < compra.getItens().size(); i++) {
                if (compra.getItens().get(i).getQtdItem() > 20) {
                    somaDescontosPorItem += descontoPorQtdItens.calcularDesconto(compra.getItens().get(i).getValorItem());
                }

                return somaDescontosPorItem;
            }
        }

        return 0;
    }
}
