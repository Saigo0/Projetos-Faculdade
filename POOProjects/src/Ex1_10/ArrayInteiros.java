package Ex1_10;

public class ArrayInteiros {
    private final int [] array;

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
            if(i == array.length-1){
                saida += array[i];
            } else
                saida += array[i] + ", ";
        }
        return saida;
    }

    public boolean existeValor(int valor){
        int cont = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] == valor){
                cont++;
            }
        }
        return cont > 0;
    }

    public String maiorValor(){
        int indiceMaior = -1;
        int maior = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
                indiceMaior = i;
            }
        }
        return "O maior valor se encontra no índice " + indiceMaior;
    }

    public int[] frequenciaAbsoluta (){
        int [] freq = new int[array.length];
        int cont = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j <= 100; j++){
                if (array[i] == j){
                    cont++;
                }
                freq[i] = cont;
            }
            cont = 0;
        }
        return freq;
    }

    public int [] ordenaArray(){
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] > array[j]){
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

}
