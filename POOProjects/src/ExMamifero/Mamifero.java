package ExMamifero;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.setCorPelo(corPelo);
    }

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String emitirSom(){
        return "Som de mamífero";
    }
}
