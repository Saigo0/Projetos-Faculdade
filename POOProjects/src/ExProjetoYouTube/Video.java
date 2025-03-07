package ExProjetoYouTube;

public class Video implements AcoesVideo {
    private String titulo;
    private int views;
    private int avaliacao;
    private int curtidas;
    private boolean reproduzindo;


    public Video(String titulo){
        this.titulo = titulo;
        this.setViews(0);
        this.setAvaliacao(1);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.getAvaliacao() + avaliacao)/this.getViews();
        this.avaliacao = nova;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    public String toString(){
        return "Vídeo {" + "título = " + this.getTitulo() + ", avaliação = " + this.getAvaliacao() + ", curtidas = " +
                this.getCurtidas() + ", views =" + this.getViews() + ", reproduzindo = " + this.isReproduzindo() + '}';
    }
}
