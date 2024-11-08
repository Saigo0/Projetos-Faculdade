package Ex1_7;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudanteTeste {

    @org.junit.Test
    public void testeEstudante1(){
        Estudante est1 = new Estudante("556644");
        est1.setNome("Fernando");
        est1.addCreditos(35);

        //verificar o estado inicial do objeto
        assertEquals("556644", est1.getMatricula());
        assertEquals("Fernando", est1.getNome());
        assertEquals(35, est1.getCreditos());

        //verificar login
        assertEquals("Fer644", est1.calcLogin());

        //verificar representação textual
        assertEquals("Nome: Fernando, matrícula: 556644, créditos: 35, login: Fer644", est1.toString());

        //manipular o objeto
        est1.addCreditos(4);
        est1.setNome("Fernando Santos");

        //verificar estado e representação textual após manipulações
        assertEquals("556644", est1.getMatricula());
        assertEquals("Fernando Santos", est1.getNome());
        assertEquals(39, est1.getCreditos());
        assertEquals("Fer644", est1.calcLogin());
        assertEquals("Nome: Fernando Santos, matrícula: 556644, créditos: 39, login: Fer644", est1.toString());
    }

    @org.junit.Test
    public void testeEstudante2(){
        Estudante est2 = new Estudante("543211");
        est2.setNome("Beth");
        est2.addCreditos(20);

        //verificação do estado inicial do objeto
        assertEquals("543211", est2.getMatricula());
        assertEquals("Beth", est2.getNome());
        assertEquals(20, est2.getCreditos());

        //verificação login
        assertEquals("Beth", est2.getNome());

        //verificação representação textual
        assertEquals("Nome: Beth, matrícula: 543211, créditos: 20, login: Bet211", est2.toString());

        //manipulação do objeto
        est2.addCreditos(10);
        est2.setNome("Beathriz");

        //testes após manipulação do objeto
        assertEquals("Beathriz", est2.getNome());
        assertEquals(30, est2.getCreditos());
        assertEquals("Bea211", est2.calcLogin());
        assertEquals("543211", est2.getMatricula());
        assertEquals("Nome: Beathriz, matrícula: 543211, créditos: 30, login: Bea211", est2.toString());
    }

}
