package ControleRemoto;


public class ControleRemoto implements Controlador{

    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais


    public ControleRemoto()
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public boolean setVolume(int volume){
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
            return true;
        } else
            return false;
    }

    public int getVolume(){
        return this.volume;
    }

    public boolean setLigado(boolean ligado){
        this.ligado = ligado;
        return true;
    }

    public boolean getLigado (){
        return this.ligado;
    }

    public boolean setTocando(boolean tocando){
        this.tocando = tocando;
        return true;
    }

    public boolean getTocando(){
        return this.tocando;
    }

    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i +=10){
            System.out.print("o");
        }
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume(){
        if(this.ligado){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(0);
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && ! this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }





}

