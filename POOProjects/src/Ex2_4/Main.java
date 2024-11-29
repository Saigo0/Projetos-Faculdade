package Ex2_4;

public class Main {
    public static void main(String[] args) {
        Treinador t1 = new Treinador("19221921928", "Gerso", 7800);
        Time time1 = new Time ("PernaDePauFC", 2024, "CidadeDoNunca");
        time1.setTreinador(t1);
        System.out.println(time1.toString());
        Treinador t2 = new Treinador("89089067", "Adailton", 9000);
        Time time2 = new Time ("ChuteiraFuradaFC", 2025, "Gramadolândia");
        time2.setTreinador(t2);
        System.out.println(time2.toString());
    }
}
