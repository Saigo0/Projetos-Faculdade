package Ex2_5;

public class Autor {
    private String nome;
    private String pseudonimo;

    public Autor(String nome, String pseudonimo) {
        this.setNome(nome);
        this.setPseudonimo(pseudonimo);
    }

    private boolean setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getPseudonimo() {
        return this.pseudonimo;
    }


}
