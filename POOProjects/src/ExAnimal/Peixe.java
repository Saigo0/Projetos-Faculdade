package ExAnimal;

public class Peixe extends Animal{
    private String corEscama;

    public Peixe(double peso, int idade, String membros, String corEscama){
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
        return "Nadando";
    }

    public String soltarBolha(){
        return "Soltando bolha";
    }

    public String alimentar(){
        return "Comendo substâncias";
    }

    public String emitirSom(){
        return "Peixe não faz som";
    }

    public String toString(){
        return super.toString() + "\nCor da escama: " + this.corEscama + "\n";
    }


}
