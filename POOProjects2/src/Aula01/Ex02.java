package Aula01;

import java.util.Scanner;

public class Ex02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calcMedia();
    }

    public static double calcMedia (){
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        return (nota1 + nota2 + nota3) / 3;
    }


}
