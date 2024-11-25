package Ex3_5;

import org.junit.Test;

public class DetranTeste {
    @Test
    public void testeDetranSC(){
        Detran det = new Detran("SC");
        Carro c1 = new Carro("Chevete", 1991, "HSG9912", 5000, 2, true);
        Moto m1 = new Moto("S1000RR", 2017, "DFS2189", 92000, 1000);

        det.addVeiculo(c1);
        det.addVeiculo(m1);

    }
}
