package Aula8;

public class Aluno {
    private String nome;
    private Double media;

    public Aluno(String _name, Double _media){
        this.nome = _name;
        if(_media>=0&&_media<=100) {
            this.media = _media;
        }else{
            this.media=0.0;
        }
    }

    public Double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setMedia(Double _media) {
        if(_media >0 && _media<=100){
            this.media = _media;
        }
        return;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }
    public void Conceito(){
        if(this.media >= 90){
            System.out.println("Conceito A!");
        } else if (this.media>=80) {
            System.out.println("Conceito B!");
        }
        else if (this.media>=70) {
            System.out.println("Conceito C!");
        }else if (this.media>=60) {
            System.out.println("Conceito D!");
        }else{
            System.out.println("Conceito F!");
        }
    }
}
