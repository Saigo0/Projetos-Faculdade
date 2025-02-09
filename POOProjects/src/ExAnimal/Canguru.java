package ExAnimal;

public class Canguru extends Mamifero{
    public Canguru(double peso, int idade, String membros, String corPelo){
        super(peso,idade,membros,corPelo);
    }

    public String usarBolsa(){
        return "Usando bolsa";
    }

    public String locomover() {
        return "Saltando";
    }
}
