package Aula01;

import java.util.Scanner;

public class Aula01 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ola();
        System.out.print(retIguaisOuDiferentes());
    }

    public static void ola(){
        System.out.println("Hello World!");
    }

    public static String retIguaisOuDiferentes(){
       int num1 = s.nextInt();
       int num2 = s.nextInt();

       if(num1==num2){
           return "Iguais";
       } else
           return "Diferentes";
    }
}
