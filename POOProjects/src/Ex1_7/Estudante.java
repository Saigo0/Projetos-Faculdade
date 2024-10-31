package Ex1_7;

public class Estudante {
    private String nome;
    private String matricula;
    private int creditos;

    public Estudante(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        if (this.nome == null) {
            return "      ";
        } else
            return this.nome;
    }

    public boolean setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        } else
            return false;
    }
    public String getMatricula() {
        return this.matricula;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public boolean addCreditos(int creditosAdd) {
        if(creditosAdd > 0){
            this.creditos += creditosAdd;
            return true;
        } else
            return false;
    }

    public String calcLogin(){
        if (this.getNome() != null || this.getMatricula() != null) {
            return this.getNome().substring(0, 3) + this.getMatricula().substring(3, 6);
        } else
            return "Nome e/ou matrícula não encontrado(s), portanto não foi possível calcular o login";
    }

    public String toString(){
        return "Nome: " + this.getNome() +
                ", matrícula: " + this.getMatricula() +
                ", créditos: " + this.getCreditos() +
                ", login: " + calcLogin();
    }
}

