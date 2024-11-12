package ExLutador;
import java.util.ArrayList;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador [] l = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Snapshadow","EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[2] = new Lutador("Dead Code","Austrália", 28, 1.93, 81.6, 13, 0, 2);


        System.out.println(l[1].status());
        System.out.println(l[2].status());

        Luta luta = new Luta();
        luta.setDesafiado(l[1]);
        luta.setDesafiante(l[2]);

        System.out.println(luta.marcarLuta());
        System.out.println(luta.lutar());

        System.out.println(l[1].status());
        System.out.println(l[2].status());
    }
}
