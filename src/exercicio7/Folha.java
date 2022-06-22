package exercicio7;

import java.util.Scanner;


public class Folha {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe quanto você ganha por hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Informe quantas horas você trabalhou no mês: ");
        double horas = input.nextDouble();
        input.close();

        double salariobruto = valorHora * horas;
        double inss = salariobruto * 0.08;
        double sindicato = salariobruto * 0.05;
        double salarioliquido = salariobruto - inss - sindicato;


        System.out.println("O seu Salário Bruto no mês é de: R$" + salariobruto );
        System.out.println("Você pagou ao INSS: R$" + inss );
        System.out.println("Você pagou ao sindicado: R$" + sindicato );
        System.out.println("O seu Salário Líquido no mês é de: R$" + salarioliquido );





    }
}
