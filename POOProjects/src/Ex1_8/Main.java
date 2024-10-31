package Ex1_8;

public class Main {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario();
        Funcionario fun2 = new Funcionario();

        fun1.setNome("Bob");
        fun1.setHorasTrab(160);
        fun1.setSalHora(6.15);
        fun1.setDependentes(2);

        fun2.setNome("Bia");
        fun2.setHorasTrab(200);
        fun2.setSalHora(12.5);
        fun2.setDependentes(0);

        System.out.println(fun1.calcBruto());
        System.out.println(fun1.calcDescINSS());
        System.out.println(fun1.calcDescIR());
        System.out.println(fun1.calcLiquido());
        System.out.println(fun1.setSalHora(8));
        System.out.println(fun1.calcLiquido());
        System.out.println(fun1.toString());

        System.out.println(fun2.toString());
        System.out.println(fun2.setDependentes(-2));
        System.out.println(fun2.setNome("Bianca"));
        System.out.println(fun2.toString());
        System.out.println(fun2.setDependentes(1));
        System.out.println(fun2.setSalHora(15));
        System.out.println(fun2.setHorasTrab(750));
        System.out.println(fun2.toString());

    }

}
