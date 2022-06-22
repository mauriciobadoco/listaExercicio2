package exercicio4;

import java.util.Scanner;

import java.util.Scanner;

public class CalculoSalario {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe quanto você ganha por hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Informe quantas horas você trabalhou no mês: ");
        double horas = input.nextDouble();
        input.close();

        double salario = valorHora * horas;

        System.out.println("O seu salário no mês é de: R$" + salario );
    }
    }