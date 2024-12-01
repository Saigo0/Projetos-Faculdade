package Ex2_6;

import java.util.ArrayList;

public class Comissao {
    private String titulo;
    private ArrayList <Deputado> deputados;

    public Comissao(String titulo) {
        this.setTitulo(titulo);
        this.deputados = new ArrayList<Deputado>();
    }

    private boolean setTitulo(String titulo) {
        if(!titulo.isEmpty()){
            this.titulo = titulo;
            return true;
        } else
            return false;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void addDeputado(Deputado deputado) {
        this.deputados.add(deputado);
    }

    public void removeDeputado(Deputado deputado) {
        this.deputados.remove(deputado);
    }

    public ArrayList <Deputado> getDeputados() {
        return this.deputados;
    }

    public String getNomeDeputados(){
        String texto = "";
        for(Deputado deputado : this.deputados){
            texto += deputado.getNome() + ", ";
        }
        return texto;
    }

    public ArrayList<Deputado> getDepPartido(int partido){
        ArrayList<Deputado> deps = new ArrayList<>();
        for(Deputado deputado : this.deputados){
            if(deputado.getNPartido() == partido){
                deps.add(deputado);
            }
        }
        return deps;
    }

    public ArrayList<Deputado> getDepEstado(String estado){
        ArrayList<Deputado> deps = new ArrayList<>();
        for(Deputado deputado : this.deputados){
            if(deputado.getEstado().equals(estado)){
                deps.add(deputado);
            }
        }
        return deps;
    }

    public String printDep(){
        String texto = "";
        for(Deputado deputado : this.deputados){
            texto += deputado.getNome() + ", ";
        }
        return "\nDeputados da " + this.getTitulo() + ": " + texto;
    }

    public String printDepEstado(String estado){
        String texto = "";
        for(Deputado deputado : this.deputados){
            if(deputado.getEstado().equals(estado)){
                texto += deputado.getNome() + ", ";
            }
        }
        return "\nDeputados do estado de " + estado +  " na comissão " + this.getTitulo() + ": " + texto;
    }

    public String printDepPartido(int partido){
        String texto = "";
        for(Deputado deputado : this.deputados){
            if(deputado.getNPartido() == partido){
                texto += deputado.getNome() + ", ";
            }
        }
        return "Deputados do partido " + partido +  " na comissão " + this.getTitulo() + ": " + texto;
    }

}
