package Ex2_3;

public class Main {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario(1234);
        Funcionario fun2 = new Funcionario(5678);
        Funcionario fun3 = new Funcionario(7890);
        Empresa emp1 = new Empresa("998877", "UDESC");
        emp1.addFuncionarios(fun1);
        emp1.addFuncionarios(fun2);
        emp1.addFuncionarios(fun3);
        fun1.setSalario(2500);
        fun2.setSalario(4500);
        fun3.setSalario(5500);
        System.out.print(emp1.getDespesasFolhasPagamento());
    }
}
