package ExMamifero;

public class Lobo extends Mamifero{
    public Lobo(double peso, int idade, int membros, String corPelo){
        super(peso, idade, membros, corPelo);
    }

    public String emitirSom(){
        return "Auuuuuuuuu";
    }
}
