package Aula4e5;

import java.util.Scanner;

public class Aula4e5 {

    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Escolha o exercicio de 1 a 3");
        switch (inputNum.nextInt()) {
            case 1 -> exercicio1(inputNum);
            //case 2 -> exercicio2(inputNum, inputStr);
            //case 3 -> exercicio3(inputNum, inputStr);
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
    /*
    private static void exercicio2(Scanner inputNum, Scanner inputStr) {
        System.out.println("||EXERCICIO 2||");
        try {
            System.out.println("Vamos Criar a sua conta:");
            System.out.println("Digite seu nome:");
            Conta cliente = new Conta(inputStr.nextLine());
            System.out.println("Digite seu saldo mensal:");
            Double saldoCliente = inputNum.nextDouble();
            cliente.setSaldo(saldoCliente);
            System.out.printf("Seu nome é: %s \nseu saldo atual é: R$%.2f", cliente.getName(), cliente.getSaldo());
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }

    //-----------------||AULA 5||---->
    private static void exercicio3(Scanner inputNum, Scanner inputStr) {
        System.out.println(" Aula 5\n||EXERCICIO 3||");
        try {
            System.out.println("O Nome do primeiro cliente:");
            Conta cliente1 = new Conta(inputStr.nextLine());
            System.out.println("Digite o saldo do primeiro cliente:");
            cliente1.setSaldo(inputNum.nextDouble());
            System.out.println("O Nome do segundo cliente:");
            Conta cliente2 = new Conta(inputStr.nextLine());
            System.out.println("Digite o saldo do segundo cliente:");
            cliente2.setSaldo(inputNum.nextDouble());

            System.out.printf("Nome Cliente1: %s\nSaldo Cliente1: %.2f\nNome Cliente2: %s\nSaldo Cliente2: %.2f\n",
                    cliente1.getName(), cliente1.getSaldo(), cliente2.getName(), cliente2.getSaldo());
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }
    private static void exercicio4(Scanner inputNum, Scanner inputStr) {
        System.out.println(" Aula 5\n||EXERCICIO 3||");

        try {
            System.out.println("Digite seu nome:");
            Conta cliente = new Conta(inputStr.nextLine());
            System.out.println("Digite um valor de deposito:");
            cliente.depositar(inputNum.nextDouble());
            System.out.println("Digite um valor de saque:");
            cliente.sacar(inputNum.nextDouble());

            System.out.printf("Seu nome é: %s \nseu saldo atual é: R$%.2f", cliente.getName(), cliente.getSaldo());
            if(cliente.getSaldo()<0){
                System.out.println("Seu saldo está negativo");
            }else if(cliente.getSaldo()==0){
                System.out.println("Seu saldo está zerado");
            }
            System.out.printf("Seu nome é: %s \nseu saldo atual é: R$%.2f", cliente.getName(), cliente.getSaldo());
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }
    */
    private static void exercicio5(Scanner inputNum, Scanner inputStr) {
        System.out.println(" Aula 5\n||EXERCICIO 3||");

        try {
            System.out.println("Digite seu nome:");
            Conta cliente = new Conta(inputStr.nextLine(),inputNum.nextDouble());
            System.out.println("Digite seu saldo inicial:");

            System.out.printf("Seu nome é: %s \nseu saldo atual é: R$%.2f", cliente.getName(), cliente.getSaldo());
            if(cliente.getSaldo()<0){
                System.out.println("Seu saldo está negativo");
            }else if(cliente.getSaldo()==0){
                System.out.println("Seu saldo está zerado");
            }
            System.out.printf("Seu nome é: %s \nseu saldo atual é: R$%.2f", cliente.getName(), cliente.getSaldo());
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }
}


