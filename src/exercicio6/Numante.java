package exercicio6;

import java.util.Scanner;


public class Numante {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int num = input.nextInt();
        input.close();

        int numante = num - 1;
        int numpos = num + 1;


        System.out.println("O número posterior é:" + numpos);
        System.out.println("O número anterior  é:" + numante);

    }
}
