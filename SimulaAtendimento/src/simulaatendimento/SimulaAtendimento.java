package simulaatendimento;
public class SimulaAtendimento {
    public static void main(String[] args) {
        SimuladorDeCaixaBanco c1 = new SimuladorDeCaixaBanco(1);
        SimuladorDeCaixaBanco c2 = new SimuladorDeCaixaBanco(2);
        SimuladorDeCaixaBanco c3 = new SimuladorDeCaixaBanco(3);
        SimuladorDeCaixaBanco c4 = new SimuladorDeCaixaBanco(4);
        SimuladorDeCaixaBanco c5 = new SimuladorDeCaixaBanco(5);
        
        c1.proximoAtendimento();
       // c2.proximoAtendimento();
        //c3.proximoAtendimento();
        c4.proximoAtendimento();
        //c5.proximoAtendimento();
        c1.proximoAtendimento();
       // c2.proximoAtendimento();
        c3.proximoAtendimento();
        c1.proximoAtendimento();
        c2.proximoAtendimento();
        c1.proximoAtendimento();
        c1.proximoAtendimento();
    }
    
}
