package EstruturaDeDecisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {
    //1 - Faça um programa que receba dois números e imprima o maior deles.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#####");

        System.out.println("Vamos determinar qual o maior entre dois números!");

        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();

        if (numero1 > numero2){
            System.out.printf("O número %s é o maior entre eles.", df.format(numero1));
        } else if (numero2 > numero1){
            System.out.printf("O número %s é o maior entre eles.", df.format(numero2));
        } else {
            System.out.printf("\nNão há número maior, ambos são iguais a %s.",df.format(numero1));
        }
    }
}
