import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        // Aula2
        Scanner input = new Scanner(System.in);
        System.out.println("|Escreva um numero de 1 a 4 para selecionar o exercicio||");
        switch (input.nextInt()) {
            case 1 -> exercicio1(input);
            case 2 -> exercicio2(input);
            case 3 -> exercicio3(input);
            case 4 -> exercicio4(input);
        }
        input.close();
    }

    private static void exercicio1(Scanner input) {
        System.out.println("||EXERCICIO 1||");
        double salario, porcentagem, acrescimo;
        try {
            System.out.println("Digite o Salario:");
            salario = input.nextDouble();

            System.out.println("Digite o porcentagem de aumento:");
            porcentagem = (input.nextDouble() / 100);
            acrescimo = salario * porcentagem;
            System.out.printf("Salario Atualizado Para: R$%.2f\nAcrescimo no Salario de R$%.2f ",
                    salario + acrescimo,
                    acrescimo);
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }

    private static void exercicio2(Scanner input) {
        // Exercicio 2
        System.out.println("||EXERCICIO 2||");
        try {
            System.out.println("Digite a primeira nota:");
            double nota1 = input.nextDouble();

            System.out.println("Digite a segunda nota:");
            double nota2 = input.nextDouble();

            double media = (nota1 + nota2) / 2;

            if (media >= 6) {
                System.out.printf("O Aluno Foi Aprovado!! \n Media do Aluno:%.2f", media);
            } else {
                System.out.printf("O Aluno Foi Reprovado... :( \n Media do Aluno:%.2f",
                        media);
            }

        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Erro:" + e + "\n");
        }

    }

    private static void exercicio3(Scanner input) {
        // Exercicio 3
        System.out.println("||EXERCICIO 3||");
        try {
            System.out.println("Digite o primeiro numero:");
            double numero1 = input.nextDouble();

            System.out.println("Digite o segundo numero:");
            double numero2 = input.nextDouble();

            double multiplicacao = numero1 * numero2;

            if (multiplicacao < 25 || multiplicacao > 50) {
                System.out.printf("A metade do valor da sua multiplicação é: %.2f",
                        multiplicacao / 2);
            } else {
                System.out.printf("Valor da sua multiplicação é: %.2f",
                        multiplicacao);
            }
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }

    }

    private static void exercicio4(Scanner input) {
        // Exercicio 4
        System.out.println("||EXERCICIO 4||");
        try {
            System.out.println("Digite um numero inteiro:");
            double numero = input.nextDouble();
            if (!(numero <= 0)) {
                System.out.println("Numero não negativo");
            }
            if (numero >= 2 && numero <= 9) {
                System.out.println("Numero entre 2 e 9");
            }
            if (numero < 0 || numero > 10) {
                System.out.println("Numero negativo ou maior que 10");
            }

        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }

    }

}
