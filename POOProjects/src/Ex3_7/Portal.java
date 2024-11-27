package Ex3_7;

import java.util.ArrayList;

public class Portal {
    private String nome;
    private String url;
    private ArrayList<Anuncio> anuncios;

    public Portal(String nome, String url) {
        this.setNome(nome);
        this.setUrl(url);
        this.anuncios = new ArrayList<Anuncio>();
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if(!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean setUrl(String url) {
        if(!url.isBlank()){
            this.url = url;
            return true;
        } else
            return false;
    }

    public void addAnuncio(Anuncio anuncio) {
        this.anuncios.add(anuncio);
    }

    public void removeAnuncio(Anuncio anuncio) {
        this.anuncios.remove(anuncio);
    }

    public ArrayList<Anuncio> getAnuncios() {
        return this.anuncios;
    }

    public String toString(){
        String texto = "";
        texto += "INFORMAÇÕES DO PORTAL: \n" + "Nome do portal: " + this.getNome() + "\n" +
                 "Url do portal: " + this.getUrl() + "\n" +
                 "INFORMAÇÕES DO(S) ANÚNCIO(S): \n";

        for (Anuncio an : this.anuncios) {
            texto += an.toString() + "\n";
        }

        return texto;
    }

}
