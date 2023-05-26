package RepeticaoB;

public class Ex8 {
    //8. Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.
    public static void main(String[] args) {
        System.out.println("Vamos calcular a soma dos 50 primeiros números ímpares!");
        int contador = 0, soma = 0;

        for (int i = 1; contador <50; i++){
            if (i % 2 != 0){
                soma += i;
                contador++;
            }
        }
        System.out.printf("A soma dos 50 primeiros números ímpares é igual a %d.", soma);


    }
}
