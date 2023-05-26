package RepeticaoB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {
    //9. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0");
        long fatorial = 1;
        int numero;

        System.out.println("Digite um número para calcularmos o seu fatorial: ");
        for (numero = input.nextInt(); numero<0; numero=input.nextInt()){
            System.out.print("O número não pode ser negativo. Por favor, digite outro número: ");
        }

        for (int i = numero; i > 0; i--){
            fatorial *= i;
        }

        System.out.printf("%d! = %s", numero, df.format(fatorial));

    }
}
