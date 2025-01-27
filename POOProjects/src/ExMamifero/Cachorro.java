package ExMamifero;

public class Cachorro extends Lobo {
    public Cachorro(double peso, int idade, int membros, String corPelo){
        super(peso,idade,membros,corPelo);
    }

    public String emitirSom(){
        return "Au Au Au";
    }

    public String reagir(String frase){
        if(frase.equalsIgnoreCase("Toma comida") || frase.equalsIgnoreCase("Olá")){
            return "Abanar e latir";
        }
        else
            return "Rosnar";
    }
    public String reagir(int hora, int min){
        if(hora < 12){
            return "Abanar";
        } else
            if (hora >= 18){
                return "Ignorar";
            } else
                return "Abanar e latir";
    }

    public String reagir (boolean dono){
        if(dono){
            return "Abanar";
        } else
            return "Rosnar e latir";
    }

    public String reagir(){
        if(this.getIdade() < 5){
            if(this.getPeso() < 10){
                return "Abanar";
            } else
                return "Latir";
        } else
            if(this.getPeso() < 10){
                return "Rosnar";
            } else
                return "Ignorar";
    }
}
