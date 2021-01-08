package conceitosdevisibilidade;

public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga; 
   private boolean tampada;
    
        // O "this" referencia o objeto que o chamou (auto referência)
    public void status(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Uma caneta: " +this.cor);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " +this.carga);
        System.out.println("Está tampada ? " +this.tampada);
    }
    private void rabiscar(){
        if(this.tampada == true){
            System.out.println("! Erro ! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscandoooo");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
