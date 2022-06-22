package exercicio3;

import java.util.Scanner;

public class CalculadoraConverte {

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Informe a medida em metros: ");
        double metro = input.nextDouble();

        double cm = metro /100;

        System.out.println("A medida em centímetros é: " +cm);
    }
}
