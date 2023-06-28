
package com.mycompany.lojavendas;

public class itemDeVenda {
    public Produto produto;
    public int quantidade;
    public double valor;

    public itemDeVenda(Produto produto, int quantidade, double valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "itemDeVenda{\n" + "produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
}
