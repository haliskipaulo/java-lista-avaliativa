package Exercicio08;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Margherita", 30.0, "Mussarela, tomate e manjericão"));
        pizzas.add(new Pizza("Calabresa", 35.0, "Calabresa, cebola e mussarela"));
        pizzas.add(new Pizza("Frango com Catupiry", 40.0, "Frango desfiado e catupiry"));

        Pedido pedido = new Pedido();

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            exibirMenu(pizzas);
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPedido(pedido, pizzas, scanner);
                    break;
                case 2:
                    cancelarPedido(pedido, scanner);
                    break;
                case 3:
                    exibirRelatorio(pedido);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void exibirMenu(List<Pizza> pizzas) {
        System.out.println("\n===== Menu de Pizzas =====");
        for (int i = 0; i < pizzas.size(); i++) {
            Pizza pizza = pizzas.get(i);
            System.out.println((i + 1) + ". " + pizza.getNome() + " - R$" + pizza.getValor());
        }
        System.out.println("\n===== Opções =====");
        System.out.println("1. Fazer Pedido");
        System.out.println("2. Cancelar Pedido");
        System.out.println("3. Exibir Relatório");
        System.out.println("4. Sair");
    }

    public static void adicionarPedido(Pedido pedido, List<Pizza> pizzas, Scanner scanner) {
        System.out.println("\n===== Adicionar Pedido =====");
        System.out.println("Escolha uma pizza pelo número:");
        int numPizza = scanner.nextInt();
        if (numPizza >= 1 && numPizza <= pizzas.size()) {
            Pizza pizzaEscolhida = pizzas.get(numPizza - 1);
            scanner.nextLine();
            System.out.print("Informe o endereço de entrega: ");
            String endereco = scanner.nextLine();
            pedido.adicionarPedido(pizzaEscolhida, endereco);
            System.out.println("Pedido adicionado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void cancelarPedido(Pedido pedido, Scanner scanner) {
        System.out.println("\n===== Cancelar Pedido =====");
        System.out.print("Informe o número do pedido a ser cancelado: ");
        int numPedido = scanner.nextInt();
        if (pedido.cancelarPedido(numPedido)) {
            System.out.println("Pedido cancelado com sucesso!");
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }

    public static void exibirRelatorio(Pedido pedido) {
        System.out.println("\n===== Relatório de Pedidos =====");
        pedido.exibirRelatorio();
    }
}
