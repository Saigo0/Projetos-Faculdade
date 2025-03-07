package Aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(situacaoAluno());
    }

    public static String situacaoAluno(){
        System.out.print("Informe quantas notas serão calculadas: ");
        int numNotas = sc.nextInt();

        int[] notas = new int[numNotas];
        double soma = 0;


        for(int i = 0; i < numNotas; i++){
            System.out.print("Informe a nota do aluno: ");
            notas[i] = sc.nextInt();
            soma += notas[i];
        }

        double media = soma / numNotas;

        if(media < 7){
            return "Reprovado, média obtida: " + media;
        }

        return "Aprovado, média obtida: " + media;
    }

}
