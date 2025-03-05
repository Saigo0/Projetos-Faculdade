package Ex2_7;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private int cod;
    private static int num = 0;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        setNome(nome);
        this.cod = Banco.num++;
        this.agencias = new ArrayList<Agencia>();
    }

    public boolean setNome(String nome) {
        if(!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
    }

    public ArrayList<Agencia> getAgencias() {
        return this.agencias;
    }

    public void addAgencia(Agencia agencia) {
        this.agencias.add(agencia);
    }

    public void removeAgencia(Agencia agencia) {
        this.agencias.remove(agencia);
    }

    public ArrayList<Agencia> getAgencias(int ano) {
        ArrayList <Agencia> ag = new ArrayList<Agencia>();
        for (Agencia agencia : this.agencias) {
            if(agencia.getOpYear() == ano){
                ag.add(agencia);
            }
        }
        return ag;
    }

    public ArrayList<Agencia> getAgencias(String city) {
        ArrayList<Agencia> ag = new ArrayList<Agencia>();
        for (Agencia agencia : this.agencias) {
            if(agencia.getCity().equals(city)){
                ag.add(agencia);
            }
        }
        return ag;
    }

    public String ImprimeAgencias() {
        String texto = "";
        for(Agencia ag : this.agencias){
            texto += ag.toString();
        }
        return "Banco: " + this.getNome() + "\n" + texto + "\n";
    }
}
