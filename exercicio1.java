import java.util.Scanner;

class Exercicios {
    public static void main(String args[]) {
        // Exercicio 1
        float metros = 1260f, minutos = 4f;
        System.out.println("||Exercicio 1:||");
        System.out.println(
                "João correu 1260 metros em 4 minutos:\n a)Qual a velocidade média de Jõao em metros por segundo? \n   R:Jõao correu em uma velocidade media de: "
                        + metros / (minutos * 60) + "m/s");
        System.out.println(
                " b)Qual a velocidade média de Jõao em kilometros por hora?\n   R:Jõao correu em uma velocidade media de: "
                        + (metros / 1000) / (minutos / 60) + "Km/h\n");
        // Exercicio 2
        System.out.println("||Exercicio 2:||");
        System.out.println(
                "Uma empresa corta barras de aço em tamanhos iguais, construa um programa onde o usuario digita o tamanho da barra \ne o que sobra da barra depois de corta-la em pedaços de 5 metros até não ser mais possivel: ");
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(" Digite tamanho da barra: ");
            double comprimento = input.nextDouble();
            System.out.printf("A barra pode ser cortada  %.0f vezes  e sobram %.2f metros \n", comprimento / 5,
                    comprimento % 5);
            input.close();
        } catch (Exception error) {
            System.out.println("Ocorreu um erro \n Erro: " + error);

        }
    }
}