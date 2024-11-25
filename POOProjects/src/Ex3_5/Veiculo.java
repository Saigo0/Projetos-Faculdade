package Ex3_5;

public class Veiculo {
    protected String modelo;
    protected int ano;
    protected String placa;
    protected double valor;

    public Veiculo(String modelo, int ano, String placa, double valor) {
        setModelo(modelo);
        setAno(ano);
        setPlaca(placa);
        setValor(valor);
    }

    public String getModelo() {
        return this.modelo;
    }
    public boolean setModelo(String modelo) {
        if(!modelo.isBlank()){
            this.modelo = modelo;
            return true;
        } else
            return false;
    }

    public int getAno() {
        return this.ano;
    }

    public boolean setAno(int ano) {
        if(ano != 0){
            this.ano = ano;
            return true;
        } else
            return false;
    }

    public String getPlaca() {
        return this.placa;
    }

    public boolean setPlaca(String placa) {
        if(!placa.isBlank()){
            this.placa = placa;
            return true;
        } else
            return false;
    }

    public double getValor() {
        return this.valor;
    }

    public boolean setValor(double valor) {
        if(valor != 0){
            this.valor = valor;
            return true;
        } else
            return false;
    }

    public double calcIPVA(){
        return this.valor * 0.02;
    }

    public String toString() {
        return  "Modelo: " + this.getModelo() + "\n" +
                "Ano: " + this.getAno() + "\n" +
                "Placa: " + this.getPlaca() + "\n" +
                "Valor: " + String.format("%.2f",this.getValor()) + "\n" +
                "IPVA: " + this.calcIPVA();
    }
}
