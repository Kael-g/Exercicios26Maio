package RepeticaoB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
    //2. Faça um programa que leia n números inteiros e imprima sua média.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        double soma, media;
        soma = media = 0;
        int n;

        System.out.println("Vamos calcular a média de alguns números!");

        System.out.print("Você quer calcular a média entre quantos números? ");
        for (n = input.nextInt(); n<0; n = input.nextInt()){
            System.out.print("Não pode ser um valor negativo, insira um valor válido: ");
        }

        for (int i = 1; i <= n; i++){
            System.out.printf("Digite o %dº número: ",i);
            soma += input.nextDouble();
        }

        if (n>0) {
            media = soma / n;
        }

        System.out.printf("\nMédia entre os %d números informados: %s", n, df.format(media));

    }
}
