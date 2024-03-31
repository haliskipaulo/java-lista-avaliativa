package Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = criarCarro(scanner);

        System.out.println("\nInformações do carro:");
        carro.exibirInformacoes();

        System.out.print("\nDigite a velocidade para acelerar o carro: ");
        int aceleracao = scanner.nextInt();
        carro.acelerar(aceleracao);

        System.out.println("\nInformações do carro após acelerar:");
        carro.exibirInformacoes();

        System.out.print("\nDigite a velocidade para frear o carro: ");
        int desaceleracao = scanner.nextInt();
        carro.frear(desaceleracao);

        System.out.println("\nInformações do carro após frear:");
        carro.exibirInformacoes();

        scanner.close();
    }

    public static Carro criarCarro(Scanner scanner) {
        System.out.print("Digite a marca do carro: ");
        String marca = scanner.next();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.next();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();

        System.out.print("Digite a placa do carro: ");
        String placa = scanner.next();

        return new Carro(marca, modelo, ano, placa);
    }
}
