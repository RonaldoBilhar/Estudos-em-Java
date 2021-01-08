package simulaatendimento;
public class SimuladorDeCaixaBanco {
    static private int numeroCliente;
    private int numeroCaixa;

    public SimuladorDeCaixaBanco(int numeroCaixa) {
        this.numeroCliente = 0;
        this.numeroCaixa = numeroCaixa;
        System.out.println("Caixa " + this.numeroCaixa + " iniciou atendimento");
    }
    public void proximoAtendimento(){
        this.numeroCliente ++;
        System.out.println("Cliente com senha número " + this.numeroCliente +
                            " favor dirigir-se ao caixa " + this.numeroCaixa + "\n");
    }
    
}
