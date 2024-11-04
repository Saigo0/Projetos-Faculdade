package Ex1_10;

public class ArrayInteiros {
    private int [] array;

    public ArrayInteiros(int tamanho) {
        array = new int[tamanho];
    }

    public boolean setValor(int indice, int valor){
        if(valor >= 0 && indice < array.length){
            array[indice] = valor;
            return true;
        } else
            return false;
    }

    public int[] getArrayInteiros(){
        return this.array;
    }

    public String toString(){
        String saida = "";
        for(int i = 0; i < array.length; i++){
            saida += array[i] + ", ";
        }
        return saida;
    }

}
