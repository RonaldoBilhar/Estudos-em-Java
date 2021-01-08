package metodosgettersetterconstruct;

public class MetodosGetterSetterConstruct {

    public static void main(String[] args) {
       Caneta c1 = new Caneta("Bic","Azul",0.8f); //passando parametros para a função construtora
      
       
      /* //com getters
        System.out.println("Tenho uma caneta: " + c1.getModelo());
        System.out.println("ponta: " + c1.getPonta()); */
        
        // Não seria possivel assim porque "ponta" é private
        //System.out.println("ponta: " + c1.ponta);
        
        
       c1.status();
    }
    
}
