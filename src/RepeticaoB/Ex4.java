package RepeticaoB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    //2. Faça um programa que leia n números inteiros e imprima sua média.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        double soma, numero;
        soma = 0;
        int n;

        System.out.println("Vamos calcular a soma de alguns números!");

        System.out.print("Você quer calcular a soma de quantos números? ");
        for (n = input.nextInt(); n<0; n = input.nextInt()){
            System.out.print("Não pode ser um valor negativo, insira um valor válido: ");
        }

        for (int i = 1; i <= n; i++){
            System.out.printf("Digite o %dº número: ",i);
            numero = input.nextDouble();
            while (numero<0){
                System.out.print("O número deve ser positivo. Por favor, informe um número válido: ");
                numero = input.nextDouble();
            }
            soma += numero;
        }

        System.out.printf("\nSoma dos %d números informados: %s", n, df.format(soma));

    }
}
