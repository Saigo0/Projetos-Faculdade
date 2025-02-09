package ExAnimal;

public abstract class Animal {
    private double peso;
    private int idade;
    private String membros;

    public Animal(double peso, int idade, String membros) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    public abstract String locomover();
    public abstract String alimentar();
    public abstract String emitirSom();

    public boolean setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
            return true;
        } else
            return false;
    }

    public boolean setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
            return true;
        } else
            return false;
    }

    public boolean setMembros(String membros) {
        if(membros.length() > 0){
            this.membros = membros;
            return true;
        } else
            return false;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getMembros() {
        return this.membros;
    }

    public String toString(){
        return  "Peso: " + this.getPeso() + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Membros: " + this.getMembros() + "\n";
    }

}
