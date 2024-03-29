package Exercicio04;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        List<Perfil> videogame = new ArrayList<Perfil>(); 
        String nome;
        int xp;
        int nivel;


        System.out.print("digite o numero de contas que deseja cadastrar - ");
        int n = Integer.parseInt(leitor.nextLine());

        for(int i = 0; i < n; i++)
        {
            Perfil jogador = new Perfil();
            System.out.print("digite o nome do jogador - ");
            nome = leitor.nextLine();
            jogador.setNome(nome);
            System.out.print("digite seu xp inicial - ");
            xp = Integer.parseInt(leitor.nextLine()); 
            jogador.setXP(xp);

            videogame.add(jogador);



            while(true)
            {

            }
        }


        leitor.close();
    }
    
}
