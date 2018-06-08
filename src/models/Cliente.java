package models;

public class Cliente {
    private String nome;
    private int pontuacao;

    public Cliente(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
