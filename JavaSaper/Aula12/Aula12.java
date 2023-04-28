package Aula12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Aula12 {
    public static void main(String[] args) {
        exercicio1();
    }
    public static void exercicio1(){
        ArrayList<Double> medias = new ArrayList<>();
        double nota1Alunos, nota2Alunos;
        double somaMedias = 0;
        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos da turma:\n");
        int qtdAlunos = inputNum.nextInt();
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("A o nome %d:\n", i+1);
            String _nome=inputStr.next();
            System.out.printf("A primeira nota do Aluno %d:\n", i+1);
            nota1Alunos=inputNum.nextDouble();
            System.out.printf("A segunda nota do Aluno %d:\n", i+1);
            nota2Alunos=inputNum.nextDouble();
            medias.add((nota1Alunos+nota2Alunos)/2);
            Alunos.add(new Aluno(_nome,nota1Alunos,nota2Alunos,medias.get(i)));
            System.out.printf("Media do Aluno %d: %.2f\n", i+1,(nota1Alunos+nota2Alunos)/2);
            somaMedias+=medias.get(i);
        }
        double media = somaMedias/medias.toArray().length;
        int qtdAlunosMedia = 0;
        for (int i = 0; i < medias.toArray().length; i++)
        {if(Alunos.get(i).getMedia() >= media){qtdAlunosMedia++;}}
        System.out.printf("A Media de notas da turma é de: %.2f\n%d alunos tiveram media maior ou igual a media da turma\nA Maior media da turma foi: %.2f\n", media, qtdAlunosMedia,Collections.max(medias));
    }
}
