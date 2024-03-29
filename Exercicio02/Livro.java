package Exercicio02;

public class Livro {
    String titulo;
    String autor;
    String ano;

    Livro(String titulo_aux, String autor_aux, String ano_aux) {
        titulo = titulo_aux;
        autor = autor_aux;
        ano = ano_aux;
    }

    void exibirInfo() {
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(ano);
    }
}
