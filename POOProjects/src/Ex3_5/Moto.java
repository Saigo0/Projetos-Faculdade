package Ex3_5;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto (String modelo, int ano, String placa, double valor, int cilindradas) {
        super(modelo, ano, placa, valor);
        this.setCilindradas(cilindradas);
    }

    public int getCilindradas() {
        return this.cilindradas;
    }

    public boolean setCilindradas(int cilindradas) {
        if (cilindradas > 0 && cilindradas < 1200) {
            this.cilindradas = cilindradas;
            return true;
        } else
            return false;
    }

    @Override
    public double calcIPVA(){
        if(this.cilindradas <= 200){
            return 0;
        } else
            return super.calcIPVA();
    }

    public String toString() {
        return "Moto: \n" + super.toString() + "Cilindradas: " + this.cilindradas;
    }
}
