package Ex3_7;

public class Anuncio {
    private String produto;
    private double valorVenda;
    private String cidade;
    private String estado;

    public String getProduto(){
        return this.produto;
    }

    public boolean setProduto(String produto){
        if(!this.produto.isBlank()){
            this.produto = produto;
            return true;
        } else
            return false;
    }

    public double getValorVenda(){
        return this.valorVenda;
    }

    public boolean setValorVenda(double valorVenda){
        if (valorVenda > 0){
            this.valorVenda = valorVenda;
            return true;
        } else
            return false;
    }

    public String getCidade(){
        return this.cidade;
    }

    public boolean setCidade(String cidade){
        if(!this.cidade.isBlank()){
            this.cidade = cidade;
            return true;
        } else
            return false;
    }

    public String getEstado(){
        return this.estado;
    }

    public boolean setEstado(String estado){
        if(!this.estado.isBlank()){
            this.estado = estado;
            return true;
        } else
            return false;
    }

    public String toString(){
        return  "Produto: " + this.getProduto() + "\n" +
                "Valor de venda: " + this.getValorVenda() + "\n" +
                "Cidade: " + this.getCidade() + "\n" +
                "Estado: " + this.getEstado();
    }

}
