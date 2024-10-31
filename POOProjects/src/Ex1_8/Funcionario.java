package Ex1_8;

public class Funcionario {
    private String nome;
    private double horasTrab;
    private double salHora;
    private int dependentes;

    public String getNome(){
        return this.nome;
    }

    public boolean setNome(String nome){
        if(!nome.isBlank()){
            this.nome = nome;
            return true;
        } else
            return false;
    }

    public double getHorasTrab(){
        return this.horasTrab;
    }

    public boolean setHorasTrab(double horasTrab){
        if(horasTrab >= 0 && horasTrab <= 250){
            this.horasTrab = horasTrab;
            return true;
        } else
            return false;
    }

    public double getSalHora(){
        return this.salHora;
    }

    public boolean setSalHora(double salHora){
        if(salHora > 0){
            this.salHora = salHora;
            return true;
        } else
            return false;
    }

    public int getDependentes(){
        return this.dependentes;
    }

    public boolean setDependentes(int dependentes){
        if(dependentes >= 0){
            this.dependentes = dependentes;
            return true;
        } else
            return false;
    }

    public double calcBruto(){
        return this.getHorasTrab() * this.getSalHora() + (this.getDependentes() * 50);
    }

    public double calcDescINSS(){
        if(this.calcBruto() <= 1000){
            return (8.5/100) * this.calcBruto();
        } else
            return 0.09 * this.calcBruto();
    }

    public double calcDescIR(){
        if(calcBruto() <= 500){
            return 0;
        } else if (calcBruto() > 500 && calcBruto() <= 1000) {
            return 0.05 * this.calcBruto();
        } else
            return 0.07 * this.calcBruto();
    }

    public double calcLiquido(){
        return this.calcBruto() - this.calcDescINSS() - this.calcDescIR();
    }

    public String toString(){
        return "Nome: " + this.getNome() +
                ", dependentes: " + this.getDependentes() +
                ", sal. hora: " + this.getSalHora() +
                ", horas trab.: " + this.getHorasTrab() +
                ", sal. bruto: " + this.calcBruto() +
                ", INSS: " + this.calcDescINSS() +
                ", IR: " + this.calcDescIR() +
                ", sal. liquido: " + this.calcLiquido();
    }

}
