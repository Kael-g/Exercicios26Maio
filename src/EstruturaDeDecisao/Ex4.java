package EstruturaDeDecisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
//      4 - Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calcula os reajustes. Portanto, faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//          Salários até R$ 280,00 (incluindo), receberão aumento de 20%
//          Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
//          Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
//          Salários de R$ 1500,00 em diante, receberão aumento de 5%
//      Após o aumento ser realizado, informe na tela:
//          O salário antes do reajuste;
//          O percentual de aumento aplicado;
//          O valor do aumento;
//          O novo salário, após o aumento;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double salario_inicial, aumento, salario_final;
        int percentual;

        System.out.println("Vamos calcular o aumento que receberá com base no seu salário atual!");
        System.out.print("Digite o valor do seu salário atual: ");
        for (salario_inicial = input.nextDouble(); salario_inicial < 0;salario_inicial = input.nextDouble()){
            System.out.print("Salário não pode ser negativo, digite um valor válido: ");
        }

        if (salario_inicial > 1500){
            percentual = 5;
        } else if (salario_inicial > 700){
            percentual = 10;
        } else if (salario_inicial > 280){
            percentual = 15;
        } else {
            percentual = 20;
        }

        aumento = salario_inicial * percentual/100;
        salario_final = salario_inicial + aumento;

        System.out.printf("%-45s%s\n", "Salário anterior:" , ("R$ " + df.format(salario_inicial)));
        System.out.printf("%-45s%s\n", "Percentual de aumento aplicado:" , (percentual + "%"));
        System.out.printf("%-45s%s\n", "Valor do aumento:" , ("R$ " + df.format(aumento)));
        System.out.printf("%-45s%s\n", "Salário após aumento:" , ("R$ " + df.format(salario_final)));

    }
}
