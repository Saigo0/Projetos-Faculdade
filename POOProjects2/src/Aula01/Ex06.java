package Aula01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(ordenaArray());
    }

    public static String ordenaArray(){
        int[] vetor = new int[5];
        int aux = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = sc.nextInt();
        }


        for(int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j + 1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        return "O array ordenado é: " + Arrays.toString(vetor);
    }

}
