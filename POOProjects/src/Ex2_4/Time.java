package Ex2_4;

public class Time {
    private String nome;
    private int anoFund;
    private String cidadeSede;
    private Treinador treinador;

    public Time(String nome, int anoFund, String cidadeSede) {
        this.setNome(nome);
        this.setAnoFund(anoFund);
        this.setCidadeSede(cidadeSede);
    }

    public Treinador getTreinador() {
        return this.treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public String getNome() {
        return this.nome;
    }

    private boolean setNome(String nome) {
        if(!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public int getAnoFund() {
        return this.anoFund;
    }

    private boolean setAnoFund(int anoFund) {
        if(anoFund > 0){
            this.anoFund = anoFund;
            return true;
        } else
            return false;
    }

    public String getCidadeSede() {
        return this.cidadeSede;
    }

    private boolean setCidadeSede(String cidadeSede) {
        if(!cidadeSede.isBlank()){
            this.cidadeSede = cidadeSede;
            return true;
        } else
            return false;
    }

    public String toString() {
        return  "\nDADOS DO TIME: \n" +
                "Nome: " + this.getNome() + "\n" +
                "Ano de fundação: " + this.getAnoFund() + "\n" +
                "Cidade Sede: " + this.getCidadeSede() + "\n" +
                "\nDADOS DO TREINADOR: \n" +
                "Treinador: " + this.getTreinador().getNome() + "\n" +
                "CPF: " + this.getTreinador().getCpf() + "\n" +
                "Salário mensal: " + this.getTreinador().getSalMensal();
    }
}
