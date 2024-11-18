package Ex3_5;

public class Carro extends Veiculo{

    private int portas;

    public Carro(String modelo, int ano, String placa, double valor) {
        super(modelo, ano, placa, valor);
        setPortas(portas);
    }

    public int getPortas() {
        return this.portas;
    }

    public boolean setPortas(int portas) {
        if(portas > 1 && portas < 100){
            this.portas = portas;
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return  "Carro: " + super.toString() + "\n" +
                "Portas: " + this.getPortas();
    }
}
