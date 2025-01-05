package ExAnimal;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(double peso, int idade, String membros, String corPelo) {
        super(peso, idade, membros);
        this.setCorPelo(corPelo);
    }

    public String getCorPelo() {
        return this.corPelo;
    }

    public boolean setCorPelo(String corPelo) {
        if(!corPelo.isBlank()){
            this.corPelo = corPelo;
            return true;
        } else
            return false;
    }

    public String locomover(){
        return "Andando";
    }

    public String alimentar(){
        return "Mamando";
    }

    public String emitirSom(){
        return "Som";
    }

    public String toString(){
        return super.toString() + "\nCor pelo: " + this.corPelo;
    }
}
