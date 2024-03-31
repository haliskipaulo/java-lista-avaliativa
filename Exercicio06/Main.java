package Exercicio06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda();

        agenda.adicionarContato(new Contato("alice", "123456789"));
        agenda.adicionarContato(new Contato("bruno", "987654321"));
        agenda.adicionarContato(new Contato("carol", "456789123"));

        int escolha;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar novo contato");
            System.out.println("2. Buscar contato por nome");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    adicionarNovoContato(agenda, scanner);
                    break;
                case 2:
                    buscarContatoPorNome(agenda, scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 3);

        scanner.close();

    
    }
    public static void adicionarNovoContato(Agenda agenda, Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.next();

        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.next();

        Contato novoContato = new Contato(nome, telefone);
        agenda.adicionarContato(novoContato);

        System.out.println("Contato adicionado com sucesso!");
    }
    
    public static void buscarContatoPorNome(Agenda agenda, Scanner scanner) {
        System.out.print("Digite o nome do contato a ser buscado: ");
        String nome = scanner.next();

        Contato contatoEncontrado = agenda.buscarContato(nome);

        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado:");
            System.out.println("Nome: " + contatoEncontrado.getNome());
            System.out.println("Telefone: " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

}
