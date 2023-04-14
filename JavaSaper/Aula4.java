import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o exercicio de 1 a 3");
        switch (input.nextInt()) {
            case 1 -> exercicio1(input);
        }
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
}


