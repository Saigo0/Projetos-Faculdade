package ExPessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if(!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
            return true;
        } else
            return false;
    }

    public String getSexo() {
        return this.sexo;
    }

    public boolean setSexo(String sexo) {
        if(!sexo.isBlank()){
            this.sexo = sexo;
            return true;
        } else
            return false;
    }

    public final boolean fazerAniv(){
        this.setIdade(this.getIdade() + 1);
        return true;
    }

    public String toString(){
        return  "Nome: " + this.getNome() + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Sexo: " + this.getSexo() + "\n";
    }
}
