package Ex1_8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTeste {

    @Test
    public void testeFuncionario1(){
        Funcionario func1 = new Funcionario();
        func1.setNome("Maria");
        func1.setDependentes((3));
        func1.setSalHora(32);
        func1.setHorasTrab(150);

        //verificação de estado do objeto
        assertEquals("Maria", func1.getNome());
        assertEquals(3, func1.getDependentes());
        assertEquals(32, func1.getSalHora());
        assertEquals(150, func1.getHorasTrab());

        //verificação dos métodos salariais
        assertEquals(4950,func1.calcBruto());
        assertEquals(445.5,func1.calcDescINSS());
        assertEquals(346.5,func1.calcDescIR(), 0.01);
        assertEquals(4158,func1.calcLiquido());

        //verificação da representação textual
        assertEquals("Nome: Maria, dependentes: 3, sal. hora: 32.0, horas trab: 150.0, " +
                "sal. bruto: 4950.0, INSS: 445.5, IR: 346.50000000000006, sal. liquido: 4158.0",func1.toString());
    }

    @Test
    public void testeFuncionario2(){
        Funcionario func2 = new Funcionario();
        func2.setNome("Bia");
        func2.setDependentes(0);
        func2.setSalHora(12.5);
        func2.setHorasTrab(200);

        //verificação do estado inicial do objeto
        assertEquals("Bia", func2.getNome());
        assertEquals(0, func2.getDependentes());
        assertEquals(12.5, func2.getSalHora(), 0.01);
        assertEquals(200, func2.getHorasTrab(), 0.01);

        //verificação dos métodos salariais
        assertEquals(2500, func2.calcBruto(), 0.01);
        assertEquals(225, func2.calcDescINSS(), 0.01);
        assertEquals(175,func2.calcDescIR(), 0.01);
        assertEquals(2100,func2.calcLiquido(), 0.01);

        //verificação da representação textual
        assertEquals("Nome: Bia, dependentes: 0, sal. hora: 12.5, horas trab: 200.0, sal. bruto: 2500.0," +
                " INSS: 225.0, IR: 175.00000000000003, sal. liquido: 2100.0",func2.toString());
    }
}
