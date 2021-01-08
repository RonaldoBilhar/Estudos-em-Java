package contabanco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
        //método construtor
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
        // setters
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
        //getters
    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }
        /* Preferência por setar os atributo pelos
            métodos especiais
        */
        //métodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setSaldo(t.equals("cc") ? 50 : 150);
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso.");
    }
    public void fecharConta(){
        if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }else{
            System.out.println("Conta com saldo diferente de 0. Não pode ser fechada. Saldo: " + this.getSaldo());
        }
    }
    public void depositar(float d){
        if(this.getStatus() != true) {
            System.out.println("Não pode depositar em uma conta fechada.");        
        } else {
            // this.saldo += d;
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
    }
    public void sacar(float v){
        if(this.getStatus() == true && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque efetuado da conta de " +this.getDono());
        }else{
            System.out.println("Não é possível efetuar saque. Saldo:" +saldo+ ", Status:" +status);
        }
    }
    public void mensalidade(){
        if(this.getStatus()){  //se retornar true, entra no if
            this.setSaldo(this.getTipo().equals("cc") ? this.getSaldo() - 12 : this.getSaldo() - 20);
            System.out.println("Mensalidade cobrada com sucesso de " +this.getDono());
        }else{
            System.out.println("Não pode ser cobrada mensalidade de uma conta fechada.");
        }
    }
        
}
