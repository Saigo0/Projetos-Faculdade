package ExPessoaLivro;

public class Main {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        p[0] = new Pessoa("José", 20, "M");
        p[1] = new Pessoa("Pedro", 21, "M");

        Livro [] l = new Livro[2];
        l[0] = new Livro("Chihiro", "Tomas", 200, p[0]);
        l[1] = new Livro("Croônicas", "Chad", 200, p[1]);

        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].folhear(5);

        System.out.println(l[0].detalhes());
    }
}
