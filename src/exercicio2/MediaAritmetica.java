package exercicio2;

import java.util.Scanner;
public class MediaAritmetica {

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Informe a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.print("Informe a quarta nota: ");
        double nota4 = input.nextDouble();

        input.close();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média Aritmética é: " +media);
    }
}
