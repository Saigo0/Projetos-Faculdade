package Ex1_9;

import java.lang.reflect.Array;

public class InteiroPositivo {
    private int valor;

    public boolean setValor(int valor){
        if(valor >= 0){
            this.valor = valor;
            return true;
        } else
            return false;
    }

    public int getValor(){
        return this.valor;
    }

    public boolean ehImpar(){
        return !(this.valor % 2 == 0);
    }

    public int[] getDivisores(){
        int contdiv = 0;
        int i = 0;
        for (int d = this.valor; d >= 1; d--){
            if(this.valor % d == 0){
                contdiv++;
            }
        }
        int[] divisores = new int[contdiv];
        for (int d = this.valor; d >= 1; d--){
            if(this.valor % d == 0){
                divisores[i] = d;
                i++;
            }
        }
        return divisores;
    }

    public int getFatorial(){
        int fat = 1;
        for (int i = this.getValor(); i > 1; i--){
            fat = fat * i;
        }
        if (this.getValor() == 1){
            return 1;
        }
        return fat;
    }

    public double funcaoHdeX(){
        double hdex = 0;
        for (int i = 1; i <= this.getValor(); i++){
            hdex = hdex + (double) 1 /i;
        }
        return hdex;
    }

    public double funcaoPdeX(){
        double pdex = 0;
        int fat = 2;
        for (int i = 1; i <= this.getValor(); i++){
            fat = fat * i * 2;
            if (i % 2 != 0){
                pdex = pdex - (double) 1 / fat;
            } else
                pdex += (double) 1/fat;
        }
        if (this.getValor() == 0){
            return 1;
        }
        return pdex;
    }

    public double raizQ(){
        return Math.sqrt(this.getValor());
    }


}
