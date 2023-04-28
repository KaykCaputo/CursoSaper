
import java.util.*;

public class Aula10 {
    public static void main(String[] args) {
        //exercicio1();
        exericio2();
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
            Scanner inputStr = new Scanner(System.in);
            Scanner inputNum = new Scanner(System.in);
            int vinhoT = 0;
            int vinhoB = 0;
            int vinhoR = 0;
            double total = 0;
            System.out.println("Você pode adicionar vinhos");
            while (true){
                System.out.print("Digite para:\n(T)-Tinto\n(B)-Branco\n(R)-Rose \n");
                String escolha = inputStr.next().toLowerCase();
                System.out.print("Digite:\n(1)-Adicionar\n(2)-Remover");
                int escolhaAdd = inputNum.nextInt();
                switch (escolha){
                    case "t" -> {if(escolhaAdd == 1){vinhoT++;}else{vinhoT--;}}
                    case "b" -> {if(escolhaAdd == 1){vinhoB++;}else{vinhoB--;}}
                    case "r" -> {if(escolhaAdd == 1){vinhoR++;}else{vinhoR--;}}
                }
                total = vinhoT + vinhoB + vinhoR;
                System.out.print("Você quer encerrar? s/n ");
                String Sn = inputStr.next();
                if (Sn.equalsIgnoreCase("S")){
                    break;
                }
            }
            System.out.printf("Tinto:%d, Branco:%d, Rose:%d %n", vinhoT, vinhoB, vinhoR);
            System.out.printf("Porcentagem de cada vinho: \n Total: %.2f \n Vinho Tinto: %.2f%% \n Vinho Branco: %.2f%% \n Vinho Rosê: %.2f%% %n", total, (vinhoT/total * 100), (vinhoB/total * 100), (vinhoR/total * 100));
    }
    public static void Exercicio3(){
        double vendas;
        Scanner input = new Scanner(System.in);
        System.out.println("A Quantidade de vendedores");
        int nVendedores = input.nextInt();
        int melhorVendedor = 0;
        double maiorVenda = 0;
        for (int i = 0; i < nVendedores; i++) {
            System.out.println("Digite o numero de vendas:");
            vendas = input.nextDouble();
            System.out.printf("O Vendedor de id%d, vendeu %.2f", i+1, vendas);
            if(vendas>maiorVenda){
                maiorVenda = vendas;
                melhorVendedor = i+1;
            }
        }
        System.out.printf("O Melhor Vendedor Foi: %d\n com o total de vendas de: %.2f", melhorVendedor, maiorVenda);
    }
}
