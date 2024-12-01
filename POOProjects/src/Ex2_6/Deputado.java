package Ex2_6;

public class Deputado {
    private int matricula;
    private String nome;
    private int nPartido;
    private String estado;

    public Deputado(int matricula, String nome, int nPartido, String estado) {
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setNPartido(nPartido);
        this.setEstado(estado);
    }

    private boolean setMatricula(int matricula) {
        if (matricula > 0 && matricula <= 9999) {
            this.matricula = matricula;
            return true;
        } else
            return false;
    }

    public int getMatricula() {
        return this.matricula;
    }

    private boolean setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public String getNome() {
        return this.nome;
    }

    private boolean setNPartido(int nPartido) {
        if(nPartido > 0 && nPartido <= 99){
            this.nPartido = nPartido;
            return true;
        } else
            return false;
    }

    public int getNPartido() {
        return this.nPartido;
    }

    private boolean setEstado(String estado) {
        if(!estado.isEmpty()){
            this.estado = estado;
            return true;
        } else
            return false;
    }

    public String getEstado() {
        return this.estado;
    }

    public String toString() {
        return "Nome: " + this.getNome() + "\n" +
               "Matrícula: " + this.getMatricula() + "\n" +
               "Partido: " + this.getNPartido() + "\n" +
               "Estado: " + this.getEstado();
    }
}
