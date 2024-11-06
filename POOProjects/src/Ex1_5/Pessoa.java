package Ex1_5;

public class Pessoa {
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    private Pessoa conjuge;

    public Pessoa(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
            return true;
        } else
            return false;
    }

    public double getPeso() {
        return this.peso;
    }

    public boolean setAltura(double altura) {
        if(altura > 0){
            this.altura = altura;
            return true;
        } else
            return false;
    }


    public double getAltura() {
        return this.altura;
    }

    public boolean ehCasado(){
        if (this.conjuge == null){
            return false;
        } else
            return true;
    }

    public void casar(Pessoa outraPessoa){
        if (!this.ehCasado()) {
            this.conjuge = outraPessoa;
            outraPessoa.conjuge = this;
        } else
            System.out.println("Impossível casar, pois já é casado(a).");
    }

    public String getNomeConjuge(){
        if (ehCasado()){
            return this.conjuge.getNome();
        } else
            return null;
    }



    public String toString(){
        return "Nome: " + this.getNome() +
                ", peso: " + this.getPeso() +
                ", altura: " + this.getAltura();
    }
}
