package ExPessoa;

public class Aluno extends Pessoa {
    private String matr;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String matr, String curso) {
        super(nome, idade, sexo);
        this.setMatr(matr);
        this.setCurso(curso);
    }

    public String getMatr() {
        return this.matr;
    }

    public boolean setMatr(String matr) {
        if(!matr.isBlank()){
            this.matr = matr;
            return true;
        } else
            return false;
    }

    public String getCurso() {
        return this.curso;
    }

    public boolean setCurso(String curso) {
        if(!curso.isBlank()){
            this.curso = curso;
            return true;
        } else
            return false;
    }

    public String cancelarMatr(){
        this.setMatr("cancelada");
        return this.matr;
    }

    public String pagarMensalidade(){
        return "Mensalidadade paga!";
    }

    public String toString() {
        return super.toString() + "\nMatr: " + this.getMatr() + "\nCurso: " + this.getCurso() + "\n";
    }
}
