package Aula4e5;

import java.util.Scanner;

public class Aula5UltimoExercicio {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        exercicio5(inputNum,inputStr);

        inputNum.close();
        inputStr.close();

    }
    private static void exercicio5(Scanner inputNum, Scanner inputStr) {
        System.out.println(" Aula 5\n||EXERCICIO 5||");

        try {
            System.out.println("Digite seu nome:");
            Conta cliente = new Conta(inputStr.nextLine(),0);
            System.out.printf("Seu nome é: %s\nseu saldo atual é: R$%.2f", cliente.getName(), cliente.getSaldo());
            System.out.println("\nDigite um valor de deposito:");
            cliente.depositar(inputNum.nextDouble());
            System.out.println("\nDigite um valor de saque:");
            cliente.sacar(inputNum.nextDouble());
            System.out.printf("\nSeu nome é: %s \nseu saldo atual é: R$%.2f", cliente.getName(), cliente.getSaldo());


        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }
}

