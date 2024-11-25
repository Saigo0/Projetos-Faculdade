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
}
