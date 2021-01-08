package relacionamentoclasses;

import static java.lang.Math.random;
import java.util.Random;

public class Luta {
    private Lutador desafiado;      //desafiado e desafiante são do tipo "Lutador"
    private Lutador desafiante;     //é uma agregação de classes
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada.");
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Não foi possível marcar esta luta");
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
            // double ale = random();                   // Essas, são duas formas de fazer numeros 
            //int vencedor = (int)(0 + ale * (3-0));    // randomicos
                                            
            Random ale = new Random();
            int vencedor = ale.nextInt(3);
            
            System.out.println("======RESULTADO======");
            switch(vencedor){
                case 0:
                    System.out.println("Empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O vencedor foi " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O vencedor foi " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("=====================");
        }else{
            System.out.println("Luta nâo pode acontecer.");
        }
    }
    
    //métodos especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
