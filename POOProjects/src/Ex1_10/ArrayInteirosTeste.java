package Ex1_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayInteirosTeste {

    @Test
    public void testeArrayInteiros1(){
        ArrayInteiros a = new ArrayInteiros(4);
        a.setValor(0, 0);
        a.setValor(1, 1);
        a.setValor(2, 2);
        a.setValor(3, 3);

        int[] x = new int[4];
        x[0] = 0;
        x[1] = 1;
        x[2] = 2;
        x[3] = 3;
        assertArrayEquals(x, a.getArrayInteiros());
        assertEquals("0, 1, 2, 3", a.toString());
        assertTrue(a.existeValor(2));
        assertEquals("O maior valor se encontra no índice 3", a.maiorValor());

        int[] f = new int[4];
        f[0] = 1;
        f[1] = 1;
        f[2] = 1;
        f[3] = 1;
        assertArrayEquals(f, a.frequenciaAbsoluta());
        assertArrayEquals(x, a.ordenaArray());
    }


}
