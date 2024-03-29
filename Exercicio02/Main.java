package Exercicio02;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String titulo;
        String autor;
        String ano;

        List<Livro> biblioteca = new ArrayList<Livro>();

        System.out.print("digite quantos livros vc deseja cadastrar no sistema: ");
        int n = Integer.parseInt(leitor.nextLine());

        for(int i = 0; i < n; i++)
        {
            System.out.println("digite o titulo do " + (i+1) + "º livro");
            titulo = leitor.nextLine();

            System.out.println("digite o autor do " + (i+1) + "º livro");
            autor = leitor.nextLine();

            System.out.println("digite o ano de publicação do " + (i+1) + "º livro");
            ano = leitor.nextLine();

            Livro newLivro = new Livro(titulo, autor, ano);
            biblioteca.add(newLivro);
        }

        System.out.println("digite o numero do livro que deseja acessar (numeros 0 a " + (n-1) + ")");
        n = Integer.parseInt(leitor.nextLine());

        biblioteca.get(n).exibirInfo();

        leitor.close();
    }
    
}
