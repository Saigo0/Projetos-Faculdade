package Ex3_5;

public class Main {
    public static void main(String[] args) {
        Carro car1 = new Carro("Corsa", 2003, "GHY-2990", 9000, 2, true);
        Moto moto1 = new Moto("BMW", 2002, "QHY-2830", 50000, 1000);
        Detran detran1 = new Detran("SC");

        detran1.addVeiculo(car1);
        detran1.addVeiculo(moto1);

        System.out.println(detran1.toString());
    }
}
