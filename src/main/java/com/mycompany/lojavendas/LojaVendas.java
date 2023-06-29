package com.mycompany.lojavendas;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaVendas {

    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de Vendas\n");

        ArrayList<Produto> listaProduto = new ArrayList<>();
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ArrayList<Venda> listaDeVenda = new ArrayList<>();

        System.out.println("Menu de opções");
        System.out.println("1 - Criar novo Cliente\n2 - Criar novo Produto\n3 - Finalizar Venda\n4 - Relatórios\n0 - Sair do Sistema");
        System.out.print("Digite uma opção: ");
        int opcao = scannerNumber.nextInt();
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.println("\nCriar novo Cliente");
                    System.out.print("Nome: ");
                    String nome = scannerText.nextLine();
                    System.out.print("CEP: ");
                    String cep = scannerText.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scannerText.nextLine();
                    System.out.print("Estado: ");
                    String estado = scannerText.nextLine();
                    Cliente cliente1 = new Cliente(nome, cep, cidade, estado);
                    System.out.println("\nCliente " + cliente1.getNome() + ", foi criado com sucesso.");
                    listaCliente.add(cliente1);
                    break;
                case 2:
                    System.out.println("\nCriar novo Produto");
                    System.out.print("Descrição: ");
                    String descricao = scannerText.nextLine();
                    System.out.print("Peso: ");
                    double peso = scannerNumber.nextDouble();
                    System.out.print("Preço: ");
                    double preco = scannerNumber.nextDouble();
                    Produto produto1 = new Produto(descricao, peso, preco);
                    System.out.println("\nProduto " + produto1.getDescricao() + ", foi criado com sucesso.");
                    listaProduto.add(produto1);
                    break;
                case 3:
                    System.out.println("\nIniciando Venda");
                    for (Cliente cliente : listaCliente) {
                        System.out.println(cliente.getCodigo() + " - " + cliente.getNome());
                    }

                    System.out.print("Informe o código do Cliente: ");
                    int codigoCliente = scannerNumber.nextInt();

                    if (codigoCliente > listaCliente.size()) {
                        System.out.println("Problema - Cliente não existe");
                        System.exit(0);
                    } 
                    Venda venda1 = new Venda(listaCliente.get(codigoCliente));

                    for (Produto produto : listaProduto) {
                        System.out.println(produto.getCodigo() + " - " + produto.getDescricao());
                    }
                    int codigoProduto = 999;
                    while (codigoProduto != 9999) {
                        System.out.print("Informe o código do Produto ou 9999 para sair: ");
                        codigoProduto = scannerNumber.nextInt();
                        double somaValorProdutoQuantidade = 0;
                        try {

                            if (codigoProduto == listaProduto.get(codigoProduto).getCodigo()) {
                                System.out.print("Informe a quantidade do Produto: ");
                                int quantidadeProduto = scannerNumber.nextInt();
                                somaValorProdutoQuantidade = listaProduto.get(codigoProduto).getPreco() * quantidadeProduto;
                                venda1.addListaVenda(listaProduto.get(codigoProduto), quantidadeProduto, somaValorProdutoQuantidade);

                            }
                        } catch (java.lang.IndexOutOfBoundsException e) {
                            System.out.println("Código do produto inexistente.");
                        }

                    }
                    listaDeVenda.add(venda1);
                    System.out.println("\nVenda: " + venda1);
                    break;

                case 4:
                    System.out.println("\nIniciando Relatórios\n");
                    System.out.println("1 - Relatório de Cliente\n2 - Relatório de Produto\n3 - Relatório de Venda\n0 - Sair de Relatórios");
                    System.out.print("Digite uma opção: ");
                    int opcaoRelatorio = scannerNumber.nextInt();
                    if (opcaoRelatorio == 1) {
                        System.out.println(listaCliente);
                    } else if (opcaoRelatorio == 2) {
                        System.out.println(listaProduto);
                    } else if (opcaoRelatorio == 3) {
                        System.out.println(listaDeVenda);
                    } else {
                        System.out.println("Opção invalida!");
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }

            System.out.println("\nMenu de opções");
            System.out.println("1 - Criar novo Cliente\n2 - Criar novo Produto\n3 - Finalizar Venda\n4 - Relatórios\n0 - Sair do Sistema");
            System.out.print("Digite uma opção: ");
            opcao = scannerNumber.nextInt();
        }
        System.out.println("\n\nProcesso finalizado...\n");
    }
}
