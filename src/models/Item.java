package models;

public class Item {
    private String nomeItem;
    private int qtdItem;
    private double valorItem;

    public Item(String nomeItem, int qtdItem, double valorItem) {
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
        this.valorItem = valorItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public double getValorItem() {
        return valorItem;
    }
}
