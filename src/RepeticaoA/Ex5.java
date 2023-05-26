package RepeticaoA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {
    //5 - Faça um programa para zerar a fila de um banco.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        int posicao;

        System.out.print("Qual é a sua posição na fila do banco? ");
        for (posicao = input.nextInt(); posicao < 0; posicao = input.nextInt()){
            System.out.print("A posição não pode ser um número negativo. Digite um valor válido: ");
        }

        for (int i = posicao-1; i > 0; i--){
            if (i>1) {
                System.out.printf("Há %d pessoas na sua frente. Por favor, aguarde.\n", i);
            } else {
                System.out.print("Não vá embora!!! Há somente 1 pessoa na sua frente. Vai ser rapidinho agora!\n");
            }
        }
        System.out.println("Quase lá! Não tem mais ninguém na sua frente, você já é o próximo! :D");

    }
}
