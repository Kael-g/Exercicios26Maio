package RepeticaoB;

import java.util.Scanner;

public class Ex6 {
    //6. Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário. O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido (começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma, inicio, fim;
        soma = 0;

        System.out.println("Vamos somar os números ímpares em um intervalo definido por você!");
        System.out.print("Digite o início do intervalo: ");
        inicio = input.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        fim = input.nextInt();

        if (inicio <= fim){
            for (int i = inicio; i <= fim; i+=2){
                if (i %2 == 0) {
                    i += 1;
                }
                soma += i;
            }
            System.out.printf("A soma dos números ímpares entre %d e %d é igual a %d.", inicio, fim, soma);
        } else {
            System.out.print("Intervalo de valores inválido.");
        }

    }
}
