import Aula8.Aluno;

import java.util.*;

public class Aula9 {
    public static void main(String[] args) {
        //exercicio1();
        exercicio2();
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
    public static void exercicio2(){
        /*Faça um programa que recebe do usuário
        o salário de todos os 20 funcionários de uma empresa.
        O programa deve mostrar o gasto da empresa com o salário dos funcionários.
         */
        int counter = 0;
        List<Double> salario = new ArrayList<>();
        Scanner inputNum = new Scanner(System.in);
        while (counter<=20){
            System.out.println("Digite o salario do funcionario:\n");
            salario.add(inputNum.nextDouble());
            counter++;
        }
        double soma = 0;
        for (double n : salario) {
            soma += n;
        }
        System.out.printf("A o gasto da empresa com salarios é de: %.2f \nA media salarial é de: %.2f\n", soma, soma/salario.toArray().length);
    }
}
