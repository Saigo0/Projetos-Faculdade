package Ex3_7;

public class AnuncioPago extends Anuncio {
    private int dias;
    private double valPago;

    public int getDias() {
        return this.dias;
    }

    public boolean setDias(int dias) {
        if (dias > 0){
            this.dias = dias;
            return true;
        } else
            return false;
    }

    public double getValPago() {
        return this.valPago;
    }

    public boolean setValPago(double valPago) {
        if (valPago > 0){
            this.valPago = valPago;
            return true;
        } else
            return false;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDias: " +
                this.getDias() + "\nValPago: " +
                this.getValPago();
    }



}
