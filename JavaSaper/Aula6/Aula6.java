package Aula6;

import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 2 para escolher um exercicio:");
        switch (inputNum.nextInt()) {
            case 1 -> EmployeeTest();
            case 2 -> dateTest(inputNum);
        }

        }

        public static void EmployeeTest () {
            Employee funcionario1 = new Employee("Kayk", "Caputo", 100);
            Employee funcionario2 = new Employee("Cidadão", "Anonimo", 9999);
            System.out.printf("Funcionario: %s %s\nSalario Anual: $%.2f\n", funcionario1.getFirstName(), funcionario1.getLastName(), (funcionario1.getSalary() * 12));
            System.out.printf("Funcionario: %s %s\nSalario Anual: $%.2f\n", funcionario2.getFirstName(), funcionario2.getLastName(), (funcionario2.getSalary() * 12));
            System.out.println("\nApós o aumento de 10%:\n");
            funcionario1.setSalary(funcionario1.getSalary() + (funcionario1.getSalary() * (0.1)));
            funcionario2.setSalary(funcionario2.getSalary() + (funcionario2.getSalary() * (0.1)));
            System.out.printf("Funcionario: %s %s\nSalario Anual: $%.2f\n", funcionario1.getFirstName(), funcionario1.getLastName(), (funcionario1.getSalary() * 12));
            System.out.printf("Funcionario: %s %s\nSalario Anual: $%.2f\n", funcionario2.getFirstName(), funcionario2.getLastName(), (funcionario2.getSalary() * 12));

        }
        public static void dateTest (Scanner inputNum) {
            System.out.println("Teste sistema de data:\n");
            System.out.println("Digite um dia de 1 a 31:");
            int day = inputNum.nextInt();
            System.out.println("Digite um mês de 1 a 12:");
            int month = inputNum.nextInt();
            System.out.println("Digite ano:");
            int year = inputNum.nextInt();
            Data data = new Data(day,month,year);
            data.displayDate();

        }
}



