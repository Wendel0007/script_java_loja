package com.mycompany.lojavendas;

public class Cliente {
    private int codigo;
    private static int contador = 0;
    private String nome;
    private String cep;
    private String cidade;
    private String estado;
    
    public Cliente(String nome, String cep, String cidade, String estado) {
        this.codigo = contador;
        this.nome = nome;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        contador++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente: " + "nome=" + nome + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado;
    }
     
    
}
