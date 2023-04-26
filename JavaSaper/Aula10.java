
import java.util.*;

public class Aula10 {
    public static void main(String[] args) {
        //exercicio1();
    }
    public static void exercicio1(){
        Scanner inputNum = new Scanner(System.in);
        int valorDigitado;
        List<Integer> numeros = new ArrayList<>();
        while (true){
            System.out.println("Digite um numero inteiro, positivo e par:");
            valorDigitado = inputNum.nextInt();
            if (valorDigitado<0 || valorDigitado % 2 !=0) {
                break;
            }else{
                numeros.add(valorDigitado);
            }
        }
        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }
        if(numeros.toArray().length!=0){
            System.out.printf("A soma dos numeros digitados é de:%.2f\n",soma);
            System.out.printf("A media aritmetica dos numeros digitados é de:%.2f",soma/numeros.toArray().length );
        }else{
            System.out.println("Você não digitou nenhum numero");
        }
    }
    public static void exericio2(){

    }
}
