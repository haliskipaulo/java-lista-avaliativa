package Exercicio08;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorPedidos = 0;
    private List<ItemPedido> pedidos;

    public Pedido() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pizza pizza, String endereco) {
        contadorPedidos++;
        pedidos.add(new ItemPedido(contadorPedidos, pizza, endereco));
    }

    public boolean cancelarPedido(int numPedido) {
        for (ItemPedido item : pedidos) {
            if (item.getNumeroPedido() == numPedido) {
                pedidos.remove(item);
                return true;
            }
        }
        return false;
    }

    public void exibirRelatorio() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
        } else {
            for (ItemPedido item : pedidos) {
                System.out.println(item);
            }
        }
    }
}

class ItemPedido {
    private int numeroPedido;
    private Pizza pizza;
    private String endereco;

    public ItemPedido(int numeroPedido, Pizza pizza, String endereco) {
        this.numeroPedido = numeroPedido;
        this.pizza = pizza;
        this.endereco = endereco;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Pedido #" + numeroPedido + ": " + pizza.getNome() + " - R$" + pizza.getValor() + " | Endereço: " + endereco;
    }
}

class Pizza {
    private String nome;
    private double valor;
    private String ingredientes;

    public Pizza(String nome, double valor, String ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getIngredientes() {
        return ingredientes;
    }
}