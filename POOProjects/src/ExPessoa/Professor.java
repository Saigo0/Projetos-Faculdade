package ExPessoa;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public boolean setEspecialidade(String especialidade) {
        if(!especialidade.isBlank()){
            this.especialidade = especialidade;
            return true;
        } else
            return false;
    }

    public double getSalario() {
        return this.salario;
    }

    public boolean setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
            return true;
        } else
            return false;
    }

    public void receberAum(double valor){
        this.setSalario(this.getSalario() + valor);
    }

    public String toString(){
        return super.toString() + "\nEspecialidade: " + this.getEspecialidade() + "\nSalario: " + this.getSalario();
    }


}
