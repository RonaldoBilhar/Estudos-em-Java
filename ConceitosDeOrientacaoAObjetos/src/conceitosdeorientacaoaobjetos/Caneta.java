
package conceitosdeorientacaoaobjetos;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga; 
    boolean tampada;
    
        // O "this" referencia o objeto que o chamou (auto referência)
    void status(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Uma caneta: " +this.cor);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " +this.carga);
        System.out.println("Está tampada ? " +this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("! Erro ! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscandoooo");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
