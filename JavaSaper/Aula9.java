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
        int i = 0;
        Random gerador = new Random();

        List<Double> salarios = new ArrayList<>();
        Scanner inputNum = new Scanner(System.in);
        while (i<20 &&inputNum.nextLine()!=null){
            double salario = gerador.nextDouble(1320,20000);
            /*
            System.out.println("Digite o salario do funcionario:\n");
            salarios.add(inputNum.nextDouble());
            */

             System.out.printf("O Salario do funcionario é: %.2f\n", salario);
             salarios.add(salario);
            i++;
        }

    }
}
