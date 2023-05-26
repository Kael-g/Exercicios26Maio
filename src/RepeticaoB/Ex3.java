package RepeticaoB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3 {
//    3. Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#####");
        double maior, menor, numero;

        System.out.println("Vamos determinar o maior e o menor valor entre 10 números!");
        System.out.print("Digite o 1º número: ");
        maior = menor = input.nextDouble();
        for(int i = 1; i<10; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            numero = input.nextInt();
            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }

        System.out.printf("O maior número digitado foi %s e o menor %s.", df.format(maior), df.format(menor));
    }
}
