package ExAnimal;

public class Cachorro extends Mamifero{
    public Cachorro(double peso, int idade, String membros, String corPelo){
        super(peso,idade,membros,corPelo);
    }

    public String enterrarOsso(){
        return "Enterrando osso";
    }

    public String abanarRabo(){
        return "Abanando Rabo";
    }
}
