package metodosgettersetterconstruct;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    
    public Caneta(String m, String c, float p){   // este é o método construtor
        this.tampar();
        this.cor = c;
        this.ponta = p;
        this.setModelo(m); // usando o metodo setter
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
}
