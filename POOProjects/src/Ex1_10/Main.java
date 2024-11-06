package Ex1_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayInteiros array = new ArrayInteiros(2);
        array.setValor(1,1);
        array.setValor(0,2);
        System.out.println(Arrays.toString(array.getArrayInteiros()));
        System.out.println(array.toString());
        System.out.println(Arrays.toString(array.frequenciaAbsoluta()));
        System.out.println(Arrays.toString(array.ordenaArray()));
    }
}
