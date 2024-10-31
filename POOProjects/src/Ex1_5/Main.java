package Ex1_5;

public class Main {



    public static void main(String[] args) {
        Pessoa maria = new Pessoa (1990);
        Pessoa jose = new Pessoa (1985);

        maria.setNome("Maria");
        jose.setNome("José");

        maria.setPeso(60.5);
        jose.setPeso(80);

        maria.setAltura(1.75);
        jose.setAltura(1.85);


        System.out.println(maria.toString());
        System.out.println(jose.toString());
        jose.casar(maria);
        System.out.print(jose.getNomeConjuge());
    }

}
