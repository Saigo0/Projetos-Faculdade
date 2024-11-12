package ExLutador;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates ) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public boolean setNome(String nome) {
        if (!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNacionalidade(String nacionalidade) {
        if (!nacionalidade.isBlank()){
            this.nacionalidade = nacionalidade;
            return true;
        } else
            return false;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public boolean setIdade(int idade) {
        if(idade >= 18){
            this.idade = idade;
            return true;
        } else
            return false;
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean setAltura(double altura) {
        if(altura > 0){
            this.altura = altura;
            return true;
        } else
            return false;
    }

    public double getAltura() {
        return this.altura;
    }

    public boolean setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
            this.setCategoria();
            return true;
        } else
            return false;
    }

    public double getPeso() {
        return this.peso;
    }

    private boolean setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Inválido";
            return false;
        } else
            if (this.getPeso() <= 70.3) {
                this.categoria = "Leve";
                return true;
            } else
                if (this.getPeso() <= 83.9) {
                    this.categoria = "Médio";
                    return true;
                } else
                    if (this.getPeso() <= 120.2) {
                        this.categoria = "Pesado";
                        return true;
                    } else
                        this.categoria = "Inválido";
                        return false;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public boolean addVitorias(int vitorias) {
        if(vitorias > 0){
            this.vitorias += vitorias;
            return true;
        } else
            return false;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public boolean addDerrotas(int derrotas) {
        if(derrotas > 0){
            this.derrotas += derrotas;
            return true;
        } else
            return false;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public boolean addEmpates(int empates) {
        if(empates > 0){
            this.empates += empates;
            return true;
        } else
            return false;
    }

    public int getEmpates() {
        return this.empates;
    }

    public String apresentar(){
        return  "CHEGOU A HORA! \n Apresentamos o lutador " + this.getNome() +
                ", diretamente de " + this.getNacionalidade() +
                ", com " + this.getIdade() +
                "anos de idade, " + this.getAltura() +
                " de altura e pesando " + this.getPeso() + "\n Ele vem com" + this.getVitorias() + " vitórias" +
                ", " +this.getDerrotas()+ " derrotas " +
                " e " + this.getEmpates() + "empates";
    }

    public String status(){
        return  this.getNome() + " é um peso " + this.getCategoria() + "\n" +
                "Ganhou: " + this.getVitorias() + "\n" +
                "Perdeu: " + this.getDerrotas() + "\n" +
                "Empatou: " + this.getEmpates();

    }

    public boolean ganharLuta(){
        this.addVitorias(1);
        return true;
    }

    public boolean perderLuta(){
        this.addDerrotas(1);
        return true;
    }

    public boolean empatarLuta(){
        this.addEmpates(1);
        return true;
    }


}
