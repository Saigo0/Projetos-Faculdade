package ExPessoaLivro;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public boolean setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
            return true;
        } else
            return false;
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean setSexo(String sexo) {
        if(sexo.equals("M") || sexo.equals("F")){
            this.sexo = sexo;
            return true;
        } else
            return false;
    }

    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
}
