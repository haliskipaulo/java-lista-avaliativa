package Exercicio01;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        List<Calculadora> calculos = new ArrayList<Calculadora>();
        
        System.out.println("digite a sua operação matematica. \ndigite o primeiro numero, em seguida o operador (+ para soma, - para subtração, \n/ para divisao e * para multiplicação)e por ultimo o segundo numero");
        float num1 = Float.parseFloat(leitor.nextLine());
        String operador = leitor.nextLine();
        float num2 = Float.parseFloat(leitor.nextLine());

        Calculadora operacao = new Calculadora(num1, num2, operador);
        calculos.add(operacao);

        operacao.resultado();

        leitor.close();
    }
    
}
