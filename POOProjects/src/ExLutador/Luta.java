package ExLutador;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public boolean setDesafiado(Lutador desafiado) {
        if (desafiado != null) {
            this.desafiado = desafiado;
            return desafiado != desafiante;
        } else
            return false;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public boolean setDesafiante(Lutador desafiante) {
        if (desafiante != null) {
            this.desafiante = desafiante;
            return desafiante != desafiado;
        } else
            return false;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public String marcarLuta(){
        if (setDesafiado(desafiado) && setDesafiante(desafiante)){
            if (this.desafiado.getCategoria().equals(this.desafiante.getCategoria())){
                this.aprovada = true;
                return  "Luta marcada com sucesso! \n" +
                        this.desafiante.getNome() +
                        " enfrentará " +
                        this.desafiado.getNome() +
                        " para uma luta!";
            } else {
                this.aprovada = false;
                return  "Não foi possível marcar a luta porque as categorias são diferentes!";
              }
        } else {
            this.aprovada = false;
            return "Os desafiantes são iguais ou nulos, portanto não foi possível marcar a luta!";
          }
    }

    public String lutar(){
        String texto = "";
        if (this.aprovada){
            texto += this.desafiante.apresentar() + "\n";
            texto += this.desafiado.apresentar() + "\n";
            this.defineRounds();
            Random rand = new Random();
            int dtvence = 0;
            int ddvence = 0;
            int empate = 0;
            for (int i = 1; i <= this.rounds; i++){
                int resultround = rand.nextInt(3);
                switch (resultround){
                    case 0:
                        texto += "Round: " + i + " " + ": empate!\n";
                        break;

                    case 1:
                        dtvence ++;
                        texto += "Round: " + i + " " + this.desafiante.getNome() + " vence!\n";
                        break;

                    case 2:
                        ddvence ++;
                        texto += "Round: " + i + " " + this.desafiado.getNome() + " vence!\n";
                        break;
                }
            }
            if(dtvence > ddvence){
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                texto += this.desafiante.getNome() + " ganhou a luta! \n";
            } else {
                this.desafiante.perderLuta();
                this.desafiado.ganharLuta();
                texto += this.desafiado.getNome() + " ganhou a luta! \n";
            }
            return texto;
        } else
            return "Não há como lutar, pois a luta não foi aprovada!";
    }

    public void defineRounds(){
        Random aleat = new Random();
        int rounds = aleat.nextInt(4);
        switch (rounds){
            case 0:
                this.defineRounds();
                break;

            case 2:
                this.rounds = 2;
                break;

            case 1:
                this.rounds = 1;
                break;

            case 3:
                this.rounds = 3;
                break;
        }
    }

}
