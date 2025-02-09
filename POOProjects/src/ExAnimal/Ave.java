package ExAnimal;

public class Ave extends Animal{
    private String corPena;

    public Ave(double peso, int idade, String membros, String corPena){
        super(peso,idade,membros);
        this.setCorPena(corPena);
    }

    public String getCorPena() {
        return this.corPena;
    }

    public boolean setCorPena( String corPena) {
        if(!corPena.isBlank()){
            this.corPena = corPena;
            return true;
        } else
            return false;
    }

    public String locomover(){
        return "Voando";
    }

    public String alimentar(){
        return "Comendo frutas";
    }

    public String emitirSom(){
        return "Som de ave";
    }

    public String fazerNinho(){
        return "Fazendo ninho";
    }

    public String toString(){
        return super.toString() + "\nCor da pena: " + this.corPena + "\n";
    }

}
