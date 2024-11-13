package ExPessoaLivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(0);
        this.fechar();
        this.setLeitor(leitor);
    }

    private boolean setTitulo(String titulo){
        if (!titulo.isBlank()){
            this.titulo = titulo;
            return true;
        } else
            return false;
    }

    public String getTitulo() {
        return this.titulo;
    }

    private boolean setAutor(String autor){
        if (!autor.isBlank()){
            this.autor = autor;
            return true;
        } else
            return false;
    }

    public String getAutor() {
        return this.autor;
    }

    private boolean setTotPaginas(int totPaginas){
        if (totPaginas > 0){
            this.totPaginas = totPaginas;
            return true;
        } else
            return false;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public boolean setPagAtual(int pagAtual) {
        if (pagAtual > 0){
            this.pagAtual = pagAtual;
            return true;
        } else
            return false;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public boolean setLeitor(Pessoa leitor) {
        if (leitor != null){
            this.leitor = leitor;
            return true;
        } else
            return false;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean getAberto(){
        return this.aberto;
    }

    public String detalhes(){

        return "Título: " + this.getTitulo() + "\n" +
                "Autor: " + this.getAutor() + "\n" +
                "Total de páginas: " + this.getTotPaginas() + "\n" +
                "Página atual:" + this.getPagAtual() + "\n" +
                "Leitor: " + this.leitor.getNome() + "\n" +
                "Aberto ou fechado: " + this.getAberto();
    }

    @Override
    public void fechar(){
        this.setAberto(false);
    }

    @Override
    public void abrir(){
        this.setAberto(true);
    }

    @Override
    public void avancarPag(){
        if (this.getPagAtual() < this.getTotPaginas() && this.getAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag(){
        if(!(this.getPagAtual() == 0 && this.getAberto())){
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }

    @Override
    public void folhear(int pagina ){
        if (pagina <= this.getTotPaginas() && this.getAberto()){
            this.setPagAtual(pagina);
        }
    }
}
