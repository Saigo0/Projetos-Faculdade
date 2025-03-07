package Ex2_7;

public class Agencia {
    private static int num = 0;
    private int numero;
    private String city;
    private int opYear;

    public Agencia(String city, int opYear) {
        setCity(city);
        setOpYear(opYear);
        this.numero = Agencia.num++;
    }


    public int getNum() {
        return this.numero;
    }

    public int getOpYear() {
        return this.opYear;
    }

    private boolean setOpYear(int opYear) {
        if(opYear > 0 && opYear <= 9999){
            this.opYear = opYear;
            return true;
        }
        else
            return false;
    }

    public String getCity() {
        return this.city;
    }

    private boolean setCity(String city) {
        if(!city.isBlank()){
            this.city = city;
            return true;
        } else
            return false;
    }

    public String toString() {
        return "Agencia [número = " + this.getNum() + ", cidade = " + this.getCity() + ", ano de abertura = " + this.getOpYear() + "]\n";
    }
}
