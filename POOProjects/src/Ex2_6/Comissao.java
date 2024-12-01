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

    public ArrayList<Deputado> getDepPartido(String partido){

    }

    public ArrayList<Deputado> getDepEstado(String estado){

    }

    public String printDeps(){

    }

    public String printDepEstado(String estado){

    }

    public String printDepPartido(){

    }

}
