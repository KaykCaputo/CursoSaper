import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o exercicio de 1 a 3");
        switch (input.nextInt()) {
            case 1 -> exercicio1(input);
            case 2 -> exercicio2(input);
            case 3 -> exercicio3(input);
        }
        input.close();

    }


    private static void exercicio1(Scanner input) {
        System.out.println("||EXERCICIO 1||");
        try {
            System.out.println("Digite um numero inteiro:");
            int numero = input.nextInt();
            System.out.printf("O Modulo do seu numero igual a %d", Math.abs(numero));
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }

    private static void exercicio2(Scanner input) {
        System.out.println("||EXERCICIO 2||");
        try {
            System.out.println("Digite um numero inteiro:");
            int numero = input.nextInt();
            if (numero % 2 == 0) {
                System.out.printf("O Seu numero é par \nnumero: %d", numero);
            } else {
                System.out.printf("O Seu numero é impar \n numero: %d", numero);
            }
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }

    private static void exercicio3(Scanner input) {
        System.out.println("||EXERCICIO 3||");
        try {
            System.out.println("Digite o salario do vendedor:");
            double salario = input.nextDouble();
            System.out.println("Digite o numero de vendas do vendedor:");
            double vendas = input.nextDouble();
            if (salario < 1500 && vendas > 2000) {
                System.out.printf("O Vendededor recebeu um aumento \n Salario pos aumento: %.2f", salario / (salario * 0.1));
            } else {
                System.out.println("O vendedor não recebeu um aumento... :(");
            }

        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }
}

