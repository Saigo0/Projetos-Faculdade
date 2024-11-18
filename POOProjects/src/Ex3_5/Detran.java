package Ex3_5;

import java.util.ArrayList;

public class Detran {
    private String estado;
    private ArrayList<Veiculo> veiculos;

    public void addVeiculo(Veiculo v){
        this.veiculos.add(v);
    }

    public void removeVeiculo(Veiculo v){
        this.veiculos.remove(v);
    }

    public Veiculo getVeiculos(int i){
        return this.veiculos.get(i);
    }

    public String getEstado() {
        return this.estado;
    }

    public boolean setEstado(String estado) {
        if(!estado.isBlank()){
            this.estado = estado;
            return true;
        } else
            return false;
    }

    public String toString() {
        return "";
    }
}