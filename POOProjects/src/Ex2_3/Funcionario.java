package Ex2_3;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public Funcionario(int matricula){
        this.matricula = matricula;
    }

    public boolean setNome(String nome){
        if (!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean setSalario(double salario){
        if (salario > 0){
            this.salario = salario;
            return true;
        } else
            return false;
    }

    public double getSalario(){
        return this.salario;
    }

    public int getMatricula(){
        return this.matricula;
    }
}
