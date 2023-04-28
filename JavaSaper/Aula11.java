import java.util.*;
public class Aula11 {
    public static void main(String[] args) {
        exercicio1();
        //exercicio2();
    }
    public static void exercicio1(){
        ArrayList<Double> notaAlunos = new ArrayList<>();
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos da turma:\n");
        double soma = 0;
        for (int i = 0; i < inputNum.nextInt(); i++) {
            System.out.printf("A nota do Aluno:%d\n", i+1);
            notaAlunos.add(inputNum.nextDouble());
            soma+=notaAlunos.get(i);
        }
        double media = soma/notaAlunos.toArray().length;
        int qtdAlunosMedia = 0;
        for (int i = 0; i < notaAlunos.toArray().length; i++)
        {if(notaAlunos.get(i) >= media){qtdAlunosMedia++;}}
        System.out.printf("A Media de notas da turma é de: %.2f\n%d alunos tiveram nota maior ou igual a media da turma\n", media, qtdAlunosMedia);
        System.out.printf("A Maior nota da turma foi: %.2f\n", Collections.max(notaAlunos));
    }
    public static void exercicio2(){
        Scanner inputNum = new Scanner(System.in);
        System.out.println("A quantidade de elementos do array:\n");
        int[] num = new int[inputNum.nextInt()];
        for (int i = 0; i < num.length; i++) {
            if(i%2==0){num[i]=0;}else{num[i]=1;}
        }
        System.out.println(Arrays.toString(num));
    }
}
