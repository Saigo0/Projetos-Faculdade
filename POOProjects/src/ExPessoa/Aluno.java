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

    public
}
