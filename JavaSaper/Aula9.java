import Aula8.Aluno;

import java.util.Arrays;
import java.util.Random;
public class Aula9 {
    public static void main(String[] args) {
        exercicio1();
    }
    public static void exercicio1(){
        Aluno[] Alunos = new Aluno[100];
        int counter = 0;
        String[] names = {"Jõao", "José", "Alberto", "Roberto", "Cleiton", "Luiz", "Maria", "Ana", "Melissa", "Marina", "Nicolas", "Valeria", "Felipe", "Jojo", "Kayk"};
        Random gerador = new Random();

        while (counter<=100){
            double nota1 = gerador.nextDouble(100)+1;
            double nota2 = gerador.nextDouble(100)+1;
            double nota3 = gerador.nextDouble(100)+1;
            String nome = names[gerador.nextInt(names.length)];
            Aluno aluno = new Aluno(nome, (nota1+nota2+nota3)/3);
            System.out.printf("Nome do Aluno %s\nMedia do aluno %.2f\n", aluno.getNome(), aluno.getMedia());
            aluno.Conceito();
            Alunos[(counter)] = aluno;
            counter++;
        }


    }
}
