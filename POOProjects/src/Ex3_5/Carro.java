package Ex3_5;

public class Carro extends Veiculo{

    private int portas;
    private boolean particular;

    public Carro(String modelo, int ano, String placa, double valor, int portas, boolean particular) {
        super(modelo, ano, placa, valor);
        this.setPortas(portas);
        this.setParticular(particular);
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

    public boolean getParticular(){
        return this.particular;
    }

    public void setParticular(boolean particular){
        this.particular = particular;
    }

    @Override
    public double calcIPVA(){
        if(this.particular){
            return this.valor * 0.01;
        } else {
            return super.calcIPVA();
        }
    }

    @Override
    public String toString() {
        return  "Carro: " + super.toString() +
                "Portas: " + this.getPortas();
    }
}
