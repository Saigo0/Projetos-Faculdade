package ExAnimal;

public class Tartaruga extends Reptil{
    public Tartaruga(double peso, int idade, String membros, String corEscama){
        super(peso,idade,membros,corEscama);
    }

    public String locomover(){
        return "Andando bem devagar";
    }
}
