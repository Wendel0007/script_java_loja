package com.mycompany.lojavendas;

public class Produto {
    private int codigo;
    private static int contador = 0;
    private String descricao;
    private double peso;
    private double preco;

    public Produto(String descricao, double peso, double preco) {
        this.codigo = contador;
        this.descricao = descricao;
        this.peso = peso;
        this.preco = preco;
        contador++;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", peso=" + peso + ", preco=" + preco + '}';
    }
    
}
