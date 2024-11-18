package Ex2_3;

public class Main {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario(1234);
        Funcionario fun2 = new Funcionario(5678);
        Funcionario fun3 = new Funcionario(9012);
        Empresa emp1 = new Empresa("998877", "UDESC");
        emp1.addFuncionarios(fun1);
        emp1.addFuncionarios(fun2);
        emp1.addFuncionarios(fun3);
        fun1.setSalario(2500);
        fun2.setSalario(4500);
        fun3.setSalario(5500);
        fun1.setNome(("Ana"));
        fun2.setNome(("João"));
        fun3.setNome(("Maria"));
        System.out.println(emp1.getDespesasFolhasPagamento());
        System.out.println(emp1.imprimeFuncionarios());
        fun1.setSalario(1500);
        fun2.setSalario(6500);
        fun3.setSalario(7500);
        System.out.println(emp1.getDespesasFolhasPagamento());
    }
}
