package Ex2_5;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private int ano;
    private int paginas;
    private Editora editora;
    private ArrayList <Autor> autores;

    public Livro (String titulo, int ano, int paginas) {
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setPaginas(paginas);
        this.autores = new ArrayList<Autor>();
    }

    private boolean setTitulo (String titulo) {
        if(!titulo.isBlank()){
            this.titulo = titulo;
            return true;
        } else
            return false;
    }

    public String getTitulo() {
        return this.titulo;
    }

    private boolean setAno (int ano) {
        if(ano > 0){
            this.ano = ano;
            return true;
        } else
            return false;
    }

    public int getAno() {
        return this.ano;
    }

    private boolean setPaginas (int paginas) {
        if(paginas > 0){
            this.paginas = paginas;
            return true;
        } else
            return false;
    }

    public int getPaginas() {

        return this.paginas;
    }

    public ArrayList<Autor> getAutor(){
        return this.autores;
    }

    public void addEditora(Editora editora){
        this.editora = editora;
    }

    public void removeAutor (Autor autor) {
        this.autores.remove(autor);
    }

    public void addAutor (Autor autor) {
        this.autores.add(autor);
    }

    public String getNomeAutores () {
        String nomeAutores = "";
        for (Autor autor : this.autores) {
            nomeAutores += autor.getNome() + " (" + autor.getPseudonimo() + ")" + ", ";
        }
        return nomeAutores;
    }

    public Editora getEditora() {
        return this.editora;
    }

    public String getNomeEditora() {
        return this.editora.getNome() + " (" + this.getEditora().getCidade() + ")";
    }

    public String toString() {
        return "Título: " + this.getTitulo() + "\n" +
               "Autor(es): " + this.getNomeAutores() + "\n" +
               "Editora: " + this.getNomeEditora() + "\n";

    }

}
