package conceitosdevisibilidade;

public class ConceitosDeVisibilidade {
    
    public static void main(String[] args) {
        //instanciando novo objeto na classe caneta
      Caneta c1 = new Caneta();
      c1.modelo = "Bic";
      c1.cor = "azul";
      //não consigo alterar valor, pois é privat
      //c1.ponta = 0.5f;
      c1.carga = 60;
      //c1.tampada = true;
      
      c1.destampar();
      c1.status();
      
      
    } 
}
