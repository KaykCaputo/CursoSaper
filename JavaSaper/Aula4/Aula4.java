package Aula4;

import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Escolha o exercicio de 1 a 2");
        switch (inputNum.nextInt()) {
            case 1 -> exercicio1(inputNum);
            case 2 -> exercicio2(inputNum, inputStr);
        }

        inputNum.close();
        inputStr.close();

    }

    private static void exercicio1(Scanner input) {
        System.out.println("||EXERCICIO 1||");
        try {
            System.out.println("Digite o primeiro numero:");
            int n1 = input.nextInt();
            System.out.println("Digite o segundo numero:");
            int n2 = input.nextInt();
            System.out.println("Digite o terceiro numero:");
            int n3 = input.nextInt();
            int menor = Math.min(Math.min(n1, n2), n3);
            System.out.printf("O menor numero é %d", menor);
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }
    private static void exercicio2(Scanner inputNum, Scanner inputStr) {
        System.out.println("||EXERCICIO 2||");
        Conta cliente = new Conta();
        try {
            System.out.println("Vamos Criar a sua conta:");
            System.out.println("Digite seu nome:");
            String nomeCliente = inputStr.nextLine();
            System.out.println("Digite seu saldo mensal:");
            Double saldoCliente = inputNum.nextDouble();
            cliente.setName(nomeCliente);
            cliente.setSaldo(saldoCliente);
            System.out.printf("Seu nome é: " + cliente.getName() + "\n seu saldo é: R$" + cliente.getSaldo());
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }
}


