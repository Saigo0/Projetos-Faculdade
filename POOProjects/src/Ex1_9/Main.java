package Ex1_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InteiroPositivo x = new InteiroPositivo();

        x.setValor(5);
        System.out.println(x.getValor());
        System.out.println(x.ehImpar());
        System.out.println(x.getFatorial());
        System.out.println(Arrays.toString(x.getDivisores()));
        System.out.println(x.funcaoHdeX());
        System.out.println(x.funcaoPdeX());
        System.out.println(x.raizQ());
    }
}
