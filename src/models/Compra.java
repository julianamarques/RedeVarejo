package models;

import helpers.DefineDesconto;

import java.util.List;

public class Compra {
    private Cliente cliente;
    private List<Item> itens;
    private double valorTotal;

    public Compra() {}

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItens(Item item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        for(int i = 0; i < this.itens.size(); i++) {
            this.valorTotal += this.itens.get(i).getValorItem();
        }

        return this.valorTotal;
    }

    public double aplicarDesconto() {
        return this.valorTotal - DefineDesconto.escolherDesconto(this);
    }
}
