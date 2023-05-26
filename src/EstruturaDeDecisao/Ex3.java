package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex3 {
    //3 - Faça um programa que receba duas notas parciais de um aluno.
    //O programa deve calcular a média alcançada por aluno e apresentar:
    //      A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    //      A mensagem "Reprovado", se a média for menor do que sete;
    //      A mensagem "Aprovado com Distinção", se a média for igual a dez.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Vamos determinar a média entre suas 2 notas e a sua situação!");

        System.out.print("Digite a primeira nota: ");
        for (nota1 = input.nextDouble(); nota1 < 0 || nota1 > 10; nota1 = input.nextDouble()){
            System.out.print("Nota deve estar entre 0 e 10, digite um valor válido: ");
        }
        System.out.print("Digite a segunda nota: ");
        for (nota2 = input.nextDouble(); nota2 < 0 || nota2 > 10; nota2 = input.nextDouble()){
            System.out.print("Nota deve estar entre 0 e 10, digite um valor válido: ");
        }

        media = (nota1 + nota2)/2;
        media = ((double) Math.round(media*10)/10);

        if (media < 7){
            System.out.printf("\nReprovado, média %.1f.", media);
        } else if (media < 10){
            System.out.printf("\nAprovado, média %.1f.", media);
        } else {
            System.out.printf("\nAprovado com distinção! Média %.1f! Parabéns!", media);
        }

    }
}

