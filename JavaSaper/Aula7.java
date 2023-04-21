import java.util.Scanner;
public class Aula7 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Escolha o exercicio de 1 a 2");
        switch (inputNum.nextInt()) {
            case 1 -> triangulos(inputNum);
            case 2 -> Equacao2Grau(inputNum);
        }
    }
    public static void triangulos(Scanner inputNum){
        System.out.println("Formar um triângulo, informando seus lados");
        System.out.print("Lado a: ");
        int a = inputNum.nextInt();

        System.out.print("Lado b: ");
        int b = inputNum.nextInt();

        System.out.print("Lado c: ");
        int c = inputNum.nextInt();

        if (a < b + c && b < a + c && c < b + a){
            System.out.println("Parabéns, você tem um triângulo");
            if (a == b && a == c){
                System.out.println("Triângulo equilátero");
            } else if (a == b ^ a == c) {
                System.out.println("Triângulo isóceles");
            } else if (a != b && a != c && b != c) {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Que pena, o seu triângulo não fecha");
        }
    }
    public static void Equacao2Grau(Scanner inputNum){
        System.out.println("Cálculo de Equação do 2º Grau. aX² + bX + c = 0");
        System.out.print("Coeficiente a: ");
        double a = inputNum.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = inputNum.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = inputNum.nextDouble();

        System.out.printf("(%.2f)X² + (%.2f)X + (%.2f) = 0 %n", a ,b, c);

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("Δ = %.2f%n", delta);

        if(delta > 0){
            double x1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
            double x2 = (-b - Math.pow(delta, 0.5)) / 2 * a;

            System.out.printf("Solução {X1 = %.2f ; X2 = %.2f} %n", x1, x2);

        } else {
            if (delta == 0){
                double x = -b/(2*a);
                System.out.printf("Temos apenas uma solução, S {%.2f}", x);
            } else{
                System.out.println("Solução não pertence aos reais");
            }
        }
    }
}
