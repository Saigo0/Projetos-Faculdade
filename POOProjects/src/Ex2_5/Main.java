package Ex2_5;

public class Main {
    public static void main(String[] args) {

        Editora ciaLetras = new Editora ("Cia das Letras", "São Paulo");
        Editora bookman = new Editora ("Bookman", "Porto Alegre");

        Autor stephen = new Autor ("Stephen King", "Richard Bachman");
        Autor paul = new Autor ("Paul Deitel", null);
        Autor harvey = new Autor ("Harvey Deitel", null);
        Autor alexander = new Autor ("Alexander Wald", null);

        Livro livroMarcha = new Livro("A longa marcha", 1979, 236);
        Livro livroJava = new Livro ("Java: como programar", 2017, 934);
        Livro livroAndroid = new Livro("Android para programadores", 2016, 422);


        livroMarcha.addAutor(stephen);
        livroMarcha.addEditora(ciaLetras);
        System.out.println(livroMarcha);

        livroJava.addAutor(paul);
        livroJava.addAutor(harvey);
        livroJava.addEditora(bookman);
        System.out.println(livroJava);

        livroAndroid.addAutor(alexander);
        livroAndroid.addAutor(paul);
        livroAndroid.addAutor(harvey);
        livroAndroid.addEditora(bookman);
        System.out.println(livroAndroid);
    }
}
