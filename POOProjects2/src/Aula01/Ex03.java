package Aula01;

import java.util.Scanner;

public class Ex03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calcDesc();
    }

    public static double calcDesc(){
        double val = sc.nextDouble();
        double taxa = sc.nextDouble();

        return val*(taxa/100);
    }

}
