package Ex2_5;

public class Editora {
    private String nome;
    private String cidade;

    public Editora(String nome, String cidade) {
        this.setNome(nome);
        this.setCidade(cidade);
    }

    private boolean setNome(String nome) {
        if(!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getNome() {
        return this.nome;
    }

    private boolean setCidade(String cidade) {
        if(!cidade.isBlank()){
            this.cidade = cidade;
            return true;
        } else
            return false;
    }

    public String getCidade() {
        return this.cidade;
    }

}


