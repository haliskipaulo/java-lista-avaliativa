package Exercicio04;

public class Perfil {
    private String nome;
    private int xp = 0;
    private int nivel = 0;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getXP() {
        return xp;
    }
    public void setXP(int xp) {
        this.xp += xp;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
