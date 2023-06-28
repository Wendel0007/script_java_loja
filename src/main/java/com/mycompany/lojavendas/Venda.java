package com.mycompany.lojavendas;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<itemDeVenda> itens;
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.valorTotal = 0;
        
    }
    
    public void addListaVenda(Produto produto, int quantidade, double valor) {
        itemDeVenda item = new itemDeVenda(produto, quantidade, valor);
        valorTotal(valor);
        itens.add(item);
    }
    
    public void valorTotal(double valor){
        this.valorTotal += valor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<itemDeVenda> getItemDeVenda() {
        return itens;
    }

    public void setItemDeVenda(ArrayList<itemDeVenda> itemDeVenda) {
        this.itens = itemDeVenda;
    }

    @Override
    public String toString() {
        return "Venda\n"
                + "{" + "\ncliente=" + cliente + ", \nitemDeVenda=" + itens + '}'+"\n\nValor total: R$"+ valorTotal;
    }
    
}
