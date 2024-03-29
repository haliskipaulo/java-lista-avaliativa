package Exercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        boolean continuar = true;
        int i;
        Float deposito, saque;

        ContaBancaria conta = new ContaBancaria();

        System.out.println("cadastro da conta bancária:");

        System.out.print("digite o numero da conta - ");
        String numeroConta = leitor.nextLine();
        conta.setNumeroConta(numeroConta);

        System.out.print("deposite um valor - ");
        deposito = Float.parseFloat(leitor.nextLine());
        conta.setSaldo(deposito);

        while(continuar) {
            System.out.println("digite 1 para realizar um deposito, 2 para um saque, e 0 para encerrar o programa:");
            i = Integer.parseInt(leitor.nextLine());

            if (i == 0)
                break;
            else if (i == 1)
            {
                System.out.println("digite o valor do deposito:");
                deposito = Float.parseFloat(leitor.nextLine());
                conta.setSaldo(deposito);
            }
            else if (i == 2)
            {
                System.out.println("digite o valor do saque:");
                saque = Float.parseFloat(leitor.nextLine());
                saque = saque * (-1);
                conta.setSaldo(saque);
            }
        }

        System.out.print("saldo final da conta - " + conta.getSaldo() + " reais");

        
        leitor.close();
    }
}
