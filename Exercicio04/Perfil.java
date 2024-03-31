package Exercicio04;

public class Perfil {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Perfil() {
        this.nivel = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
        while (this.pontuacao >= 100) {
            this.pontuacao -= 100;
            this.nivel++;
        }
    }

    public int getNivel() {
        return nivel;
    }
}