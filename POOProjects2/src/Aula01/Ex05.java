package Aula01;

import java.util.Scanner;

public class Ex05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(maiorEMenor());
    }

    public static String maiorEMenor(){
        int[] num = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Informe um número: ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] > maior ) {
                maior = num[i];
            }

            if (num[i] < menor) {
                menor = num[i];
            }
        }

        return "O maior número é: " + maior + "\n O menor número é: " + menor;
    }
}
