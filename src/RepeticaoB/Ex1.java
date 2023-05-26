package RepeticaoB;

public class Ex1 {
    //1 - Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes. A primeira vez com "for" e a segunda com "while".
    public static void main(String[] args) {
        System.out.println("Números de 1 a 100 utilizando o \"for\":");
        for(int i = 1; i<101;i++){
            System.out.printf("%d  ",i);
        }

        System.out.println("\n\nNúmeros de 1 a 100 utilizando o \"while\":");
        int i = 1;
        while (i < 101){
            System.out.printf("%d  ",i);
            i++;
        }
    }
}

