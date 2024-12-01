package Ex2_6;

public class Main {
    public static void main(String[] args) {
        Deputado dep1 = new Deputado(1234, "João", 99, "SC");
        Deputado dep2 = new Deputado(5678, "Maria", 98, "RS");
        Deputado dep3 = new Deputado(9012, "José", 99, "SP");
        Deputado dep4 = new Deputado(3456, "Pedro", 91, "RS");
        Deputado dep5 = new Deputado(7890, "Ana", 91, "SC");

        Comissao com1 = new Comissao("Comissão de Educação");
        Comissao com2 = new Comissao("Comissao de Constituição e Justiça");

        com1.addDeputado(dep1);
        com1.addDeputado(dep3);
        com1.addDeputado(dep4);

        com2.addDeputado(dep2);
        com2.addDeputado(dep5);
        com2.addDeputado(dep4);

        System.out.println(com1.printDep());
        System.out.println(com2.printDep());

        System.out.println(com1.printDepEstado("SC"));
        System.out.println(com2.printDepEstado("SC"));
        System.out.println(com1.printDepEstado("RS"));
        System.out.println(com2.printDepEstado("RS"));
        System.out.println(com1.printDepEstado("SP"));

        System.out.println(com1.printDepPartido(99));
        System.out.println(com2.printDepPartido(99));
        System.out.println(com1.printDepPartido(91));
        System.out.println(com2.printDepPartido(91));
        System.out.println(com1.printDepPartido(98));
        System.out.println(com2.printDepPartido(98));

    }
}
