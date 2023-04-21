package Aula8;

import java.util.Scanner;
public class Aula8 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        //exercicio1(inputNum);
        exercicio2(inputNum, inputStr);
    }

    public static void exercicio1(Scanner inputNum){
        System.out.println("Digite o preço do produto:");
        double preco = inputNum.nextDouble();
        System.out.println("Escolha o metodo de pagamento:\n1-Dinheiro\n2-21x no Cartão\n3-32x no Cartão\n4-43x no Cartão\n");
        switch (inputNum.nextInt()){
            case 1 -> {System.out.printf("Cliente escolheu pagar no dinheiro! \nO Cliente pagara %.2f", preco-(preco*0.1));}
            case 2 -> {System.out.printf("Cliente escolheu pagar em 1x no cartão! \nO Cliente pagara %.2f", preco-(preco*0.05));}
            case 3 -> {System.out.printf("Cliente escolheu pagar em 2x no cartão! \nO Cliente pagara %.2f", preco);}
            case 4 -> {System.out.printf("Cliente escolheu pagar em 3x no cartão! \nO Cliente pagara %.2f", preco+(preco*0.05));}
        }
    }
    public static void exercicio2(Scanner inputNum, Scanner inputStr){
        System.out.println("O Nome do aluno:");
        String name = inputStr.nextLine();
        System.out.println("Digite a primeira nota");
        Double n1 = inputStr.nextDouble();
        System.out.println("Digite a segunda nota");
        Double n2 = inputStr.nextDouble();
        System.out.println("Digite a terceira nota");
        Double n3 = inputStr.nextDouble();
        Double media = (n1+n2+n3)/3;
        Aluno aluno =  new Aluno(name, media);
        aluno.Conceito();
    }
}
