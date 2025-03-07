package Aula01;

import java.util.Scanner;

public class Ex01 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        MaiorDeIdade();
    }

    public static String MaiorDeIdade(){
        int idade = s.nextInt();

        if(idade >= 18){
            return "Maior de Idade";
        }
        return "Menor de Idade";
    }

}
