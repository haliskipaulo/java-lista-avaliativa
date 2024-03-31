package Exercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, scanner);
                    break;
                case 2:
                    atualizarProduto(estoque, scanner);
                    break;
                case 3:
                    removerProduto(estoque, scanner);
                    break;
                case 4:
                    exibirRelatorio(estoque);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Atualizar Produto");
        System.out.println("3. Remover Produto");
        System.out.println("4. Exibir Relatório de Estoque");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void adicionarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("\nDigite o nome do produto: ");
        String nome = scanner.next();

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(nome, codigo, quantidade, preco);
        estoque.add(produto);

        System.out.println("Produto adicionado com sucesso.");
    }

    public static void atualizarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("\nDigite o código do produto a ser atualizado: ");
        int codigo = scanner.nextInt();

        Produto produtoEncontrado = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.print("Digite a nova quantidade em estoque: ");
            int novaQuantidade = scanner.nextInt();
            produtoEncontrado.setQuantidade(novaQuantidade);

            System.out.println("Produto atualizado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void removerProduto(List<Produto> estoque, Scanner scanner) {
        System.out.print("\nDigite o código do produto a ser removido: ");
        int codigo = scanner.nextInt();

        Produto produtoEncontrado = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            estoque.remove(produtoEncontrado);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void exibirRelatorio(List<Produto> estoque) {
        System.out.println("\n===== Relatório de Estoque =====");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }
}
