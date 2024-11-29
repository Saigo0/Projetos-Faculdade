package Ex2_4;

public class Treinador {
    private String cpf;
    private String nome;
    private double salMensal;

    public Treinador(String cpf, String nome, double salMensal) {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setSalMensal(salMensal);
    }

    public String getCpf() {
        return this.cpf;
    }

    private boolean setCpf(String cpf) {
        if(!cpf.isBlank()){
            this.cpf = cpf;
            return true;
        } else
            return false;
    }

    public String getNome() {
        return this.nome;
    }

    private boolean setNome(String nome) {
        if(!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public double getSalMensal() {
        return this.salMensal;
    }

    public boolean setSalMensal(double salMensal) {
        if(salMensal > 0){
            this.salMensal = salMensal;
            return true;
        } else
            return false;
    }

    public String toString() {
        return  "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Salário mensal: " + this.getSalMensal() + "\n";

    }

}

