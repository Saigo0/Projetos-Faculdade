package Ex1_7;

public class Main {
    public static void main(String[] args) {
        Estudante est1 = new Estudante("556644");
        Estudante est2 = new Estudante("579035");

        est1.calcLogin();
        System.out.println(est1.toString());
        est1.addCreditos(4);
        System.out.println(est1.toString());
        est1.setNome("Fernando Santos");
        System.out.println(est1.toString());
        est1.calcLogin();
        System.out.println(est1.toString());

        System.out.println(est2.toString());
        est2.addCreditos(-8);
        System.out.println(est2.toString());
        est2.setNome("Elizabeth");
        System.out.println(est2.toString());



    }
}
