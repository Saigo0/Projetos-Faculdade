package ExPessoa;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setSetor(setor);
        this.setTrabalhando(trabalhando);
    }

    public String getSetor() {
        return this.setor;
    }

    public boolean setSetor(String setor) {
        if(!setor.isBlank()){
            this.setor = setor;
            return true;
        } else
            return false;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public boolean setTrabalhando(boolean trabalhando) {
        if(this.trabalhando != trabalhando){
            this.trabalhando = trabalhando;
            return true;
        } else
            return false;
    }

    public String toString(){
        return super.toString() + "\nSetor: " + this.getSetor() + "\nTrabalhando: " + this.getTrabalhando();
    }
}
