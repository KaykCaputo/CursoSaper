package Aula12;

public class Aluno {
    private String nome;
    private double nota1,nota2;

    private double media;

    public Aluno(String _nome, double _nota1,double _nota2,double _media){
        this.nome=_nome;
        this.nota1=_nota1;
        this.nota2=_nota2;
        this.media=_media;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
