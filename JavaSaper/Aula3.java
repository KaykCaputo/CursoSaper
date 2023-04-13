import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o exercicio");
        if (input.nextInt() == 1) {
            exercicio1(input);
        }
    }

    private static void exercicio1(Scanner input) {
        System.out.println("||EXERCICIO 1||");
        try {
            System.out.println("Digite um numero inteiro:");
            double numero = input.nextDouble();
            System.out.printf("O Modulo do seu numero igual a %d", Math.abs(numero));
        } catch (Exception e) {
            System.out.printf("Ocorreu um erro \n Err0:" + e + "\n");
        }
    }
}
