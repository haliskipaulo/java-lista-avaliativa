package Exercicio04;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Perfil> jogadores = new ArrayList<Perfil>(); 
        String nome;
        int xpInicial;

        System.out.print("Digite o número de jogadores que deseja cadastrar: ");
        int n = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < n; i++) {
            Perfil jogador = new Perfil();
            System.out.print("digite o nome do jogador: ");
            nome = leitor.nextLine();
            jogador.setNome(nome);
            System.out.print("digite o XP inicial do jogador: ");
            xpInicial = Integer.parseInt(leitor.nextLine());
            jogador.setPontuacao(xpInicial);

            jogadores.add(jogador);
        }

        System.out.println("\nInformações dos jogadores cadastrados:");
        for (Perfil jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Pontuação: " + jogador.getPontuacao());
            System.out.println("Nível: " + jogador.getNivel());
            System.out.println();
        }

        leitor.close();
    }
}

