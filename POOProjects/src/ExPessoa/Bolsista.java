package ExPessoa;

public class Bolsista extends Aluno{
    private double bolsa;
    public Bolsista(String nome, int idade, String sexo, String matr, String curso, double bolsa){
        super(nome, idade, sexo, matr, curso);
        this.setBolsa(bolsa);
    }

    public double getBolsa() {
        return this.bolsa;
    }

    public boolean setBolsa(double bolsa) {
        if(bolsa > 0){
            this.bolsa = bolsa;
            return true;
        } else
            return false;
    }

    public String pagarMensalidade(){
        return this.getNome() + " é um bolsista! Mensalidade paga!";
    }

    public String renovarBolsa(){
        return "Bolsa renovada!";
    }

    public String toString(){
        return super.toString() + "\nBolsa: " + this.getBolsa();
    }
}
