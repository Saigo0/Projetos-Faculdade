package ExProjetoYouTube;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public void avaliar(){
        this.getFilme().setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.getFilme().setAvaliacao(nota);
    }

    public void avaliar(double porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        } else
            if(porc <= 50){
                tot = 5;
            } else
                if(porc <= 90){
                    tot = 8;
                } else {
                    tot = 10;
                }
        this.getFilme().setAvaliacao(tot);
    }

    public String toString() {
        return "Visualizacao [espectador = " + espectador + ", filme = " + filme + "]";
    }
}
