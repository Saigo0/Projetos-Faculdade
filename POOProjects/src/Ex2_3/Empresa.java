package Ex2_3;

import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionarios(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String imprimeFuncionarios(){
        String texto = "";
        for (int i = 0; i < this.funcionarios.size(); i++) {
            texto +=  "Nome: " + this.funcionarios.get(i).getNome() + "\n";
            texto +=  "Salário: " + this.funcionarios.get(i).getSalario() + "\n";
            texto +=  "Matrícula: " + this.funcionarios.get(i).getMatricula() + "\n";
        }
        return texto;
    }

    public double getDespesasFolhasPagamento(){
        double totpgto = 0;
        for (int i = 0; i < this.funcionarios.size(); i++) {
            totpgto += this.funcionarios.get(i).getSalario();
        }
        return totpgto;
    }

}
