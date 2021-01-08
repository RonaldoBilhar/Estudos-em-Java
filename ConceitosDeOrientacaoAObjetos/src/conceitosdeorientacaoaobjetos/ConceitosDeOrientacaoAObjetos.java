
package conceitosdeorientacaoaobjetos;

public class ConceitosDeOrientacaoAObjetos {
    
    public static void main(String[] args) {
        //instanciando novo objeto na classe caneta
      Caneta c1 = new Caneta();
      c1.modelo = "Bic";
      c1.cor = "azul";
      c1.ponta = 0.7f;
      c1.carga = 90;
      c1.tampada = false;
        //métodos
     /* c1.tampar();
      c1.status();
      c1.rabiscar(); */
      
      //novo objeto (outro objeto)
      Caneta c2 = new Caneta();
      c2.modelo = "prisma";
      c2.cor = "vermelha";
      c2.ponta = 0.5f;
      c2.carga = 50;
      c2.tampar();
      
      c2.status();
      
      
    } 
}
