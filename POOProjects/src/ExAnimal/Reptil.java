package ExAnimal;

public class Reptil extends Animal {
    private String corEscama;

    public Reptil(double peso, int idade, String membros, String corEscama) {
        super(peso, idade, membros);
        this.setCorEscama(corEscama);
    }

    public String getCorEscama() {
        return this.corEscama;
    }

    public boolean setCorEscama(String corEscama) {
        if(!corEscama.isBlank()){
            this.corEscama = corEscama;
            return true;
        } else
            return false;
    }

    public String locomover(){
        return "Rastejando";
    }

    public String alimentar(){
        return "Comendo vegetais";
    }

    public String emitirSom(){
        return "Som de réptil";
    }

    public String toString(){
        return super.toString() + "\nCor da escama: " + this.getCorEscama();
    }
}
