package ExProjetoYouTube;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;


    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String toString() {
        return super.toString() + "\nLogin: " + login + "\nTotAssistido: " + totAssistido + "\n";
    }
}
