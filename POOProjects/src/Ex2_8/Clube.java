package Ex2_8;

import java.util.ArrayList;

public class Clube {
    private String nome;
    private String cidade;
    private ArrayList<Socio> socios = new ArrayList<Socio>();

    public Clube(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
        this.socios = new ArrayList<Socio>();
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public ArrayList<Socio> getSociosMenoresDeIdade() {
        ArrayList<Socio> s = new ArrayList<>();
        for (Socio socio : socios) {
            if (socio.getIdade() >= 18) {
                s.add(socio);
            }
        }
        return s;
    }

    public double getIdadeMediaSocios(){
        double soma = 0;
        for (Socio socio : socios) {
            soma += socio.getIdade();
        }
        return soma / this.socios.size();
    }

    public ArrayList<Socio> getSociosIdadeMaiorQueMedia(){
        ArrayList<Socio> s= new ArrayList<>();
        double media = this.getIdadeMediaSocios();
        for (Socio socio : socios) {
            if(socio.getIdade() > media){
                s.add(socio);
            }
        }
        return s;
    }

    public double getArrecadacaoMensalidades(){
        double total = 0;
        for (Socio socio : socios) {
            total += socio.getValorMensalidade();
        }
        return total;
    }

    public void addSocio(Socio socio){
        this.socios.add(socio);
    }

    public boolean removerSocio(int matricula){
        int verif = 0;
        for (Socio socio : socios) {
            if(socio.getMatricula() == matricula){
                socios.remove(socio);
                verif++;
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String texto = "\n Clube: " + this.getNome() + ", cidade: " + this.getCidade() + "\n Sócios: [";
        for (Socio socio : socios) {
            texto += socio.toString() + "\n";
        }
        return texto + "]";
    }
}
