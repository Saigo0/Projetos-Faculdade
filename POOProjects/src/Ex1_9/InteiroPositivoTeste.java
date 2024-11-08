package Ex1_9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

public class InteiroPositivoTeste {

    @Test
    public void testeInteiroPositivo1(){
        InteiroPositivo i = new InteiroPositivo();
        i.setValor(5);

        //verificação do estado inicial do objeto
        assertEquals(5, i.getValor());

        //verificação dos métodos
        assertTrue(i.ehImpar());
        int [] x = new int[2];
        x [0] = 5;
        x [1] = 1;
        assertArrayEquals(x , i.getDivisores());
        assertEquals(120 , i.getFatorial());
        assertEquals(2.28, i.funcaoHdeX(), 0.01);
        assertEquals(-0.19, i.funcaoPdeX(), 0.01);
        assertEquals(2.23, i.raizQ(), 0.01);
    }
}
