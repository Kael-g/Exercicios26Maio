package RepeticaoB;

import java.util.Scanner;

public class Ex7 {
    //7. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, primo;
        primo = 0;

        System.out.println("Vamos descobrir se um número é primo!");
        System.out.print("Digite um número: ");
        numero = input.nextInt();

        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                primo += 1;
            }
        }

        if (primo == 0){
            System.out.printf("%d é um número primo!", numero);
        } else {
            System.out.printf("%d não é um número primo, pois pode ser dividido por outros %d números além de 1 e ele mesmo.", numero, primo);
        }

    }
}
