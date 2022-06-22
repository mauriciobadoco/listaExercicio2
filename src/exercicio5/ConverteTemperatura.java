package exercicio5;

import java.util.Scanner;


public class ConverteTemperatura {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        double fahr = input.nextDouble();
        input.close();

        double celsius = (fahr - 32) / 1.8;

        System.out.println("A tempera em graus Celsius é de:" + celsius);
    }
}