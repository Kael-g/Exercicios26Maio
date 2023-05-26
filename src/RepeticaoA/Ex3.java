package RepeticaoA;

import java.text.DecimalFormat;
import java.util.Deque;
import java.util.Scanner;

public class Ex3 {
    //3 - Faça um programa para ler 5 números e mostrar o resultado da soma desses números.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        double soma = 0;

        System.out.println("Vamos somar 5 números!");

        for (int i = 0; i<5;i++){
            System.out.printf("Digite o %dº número: ",i+1);
            soma += input.nextDouble();
        }

        System.out.println("Soma = " + df.format(soma));
    }
}
