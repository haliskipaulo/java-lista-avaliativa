package Exercicio01;

public class Calculadora {
    float num1;
    float num2;
    float saida;
    String operador;

    Calculadora(float n1, float n2, String op) {
        num1 = n1;
        num2 = n2;
        operador = op;
    }

    void resultado() {
        if (operador.equals("+"))
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        else if (operador.equals("-"))
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        else if (operador.equals("*"))
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        else if (operador.equals("/"))
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));    
    }


}
