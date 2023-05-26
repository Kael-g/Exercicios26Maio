package EstruturaDeDecisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
    //2 - Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double precoA, precoB, precoC;

        System.out.println("Deixe-me ajudar a escolher o mais barato entre 3 produtos!");

        System.out.print("Digite o preço do produto A: ");
        for (precoA = input.nextDouble(); precoA < 0;precoA = input.nextDouble()){
            System.out.print("Preço não pode ser negativo, digite um preço válido: ");
        }
        System.out.print("Digite o preço do produto B: ");
        for (precoB = input.nextDouble(); precoB < 0;precoB = input.nextDouble()){
            System.out.print("Preço não pode ser negativo, digite um preço válido: ");
        }
        System.out.print("Digite o preço do produto C: ");
        for (precoC = input.nextDouble(); precoC < 0;precoC = input.nextDouble()){
            System.out.print("Preço não pode ser negativo, digite um preço válido: ");
        }

        if (precoA < precoB && precoA < precoC){
            System.out.printf("O mais barato é o produto A, custando R$ %s.", df.format(precoA));
        } else if (precoB < precoA && precoB < precoC){
            System.out.printf("O mais barato é o produto B, custando R$ %s.", df.format(precoB));
        } else if (precoC < precoA && precoC < precoB) {
            System.out.printf("O mais barato é o produto C, custando R$ %s.", df.format(precoC));
        } else if (precoA == precoB && precoA < precoC){
            System.out.printf("Os mais baratos são os produto A e B, ambos custam R$ %s.", df.format(precoA));
        }else if (precoC == precoB && precoB < precoA){
            System.out.printf("Os mais baratos são os produto B e C, ambos custam R$ %s.", df.format(precoB));
        }else if (precoA == precoC && precoA < precoB){
            System.out.printf("Os mais baratos são os produto A e C, ambos custam R$ %s.", df.format(precoA));
        } else {
            System.out.printf("Os produtos A, B e C tem o mesmo preço, todos custam R$ %s.", df.format(precoA));
        }

    }
}
