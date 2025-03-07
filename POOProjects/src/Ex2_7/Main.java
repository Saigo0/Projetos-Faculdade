package Ex2_7;

public class Main {
    public static void main(String[] args) {
        Banco brad = new Banco("Bradesco");

        Agencia agbrad1 = new Agencia("Ibirama", 2025);
        Agencia agbrad2 = new Agencia("Monte Carmelo", 2026);

        System.out.println(agbrad1.toString());

        brad.addAgencia(agbrad1);
        brad.addAgencia(agbrad2);

        System.out.println(agbrad2.toString());

        System.out.println(brad.ImprimeAgencias());
    }
}
