/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerorandomico;

/**
 *
 * @author ronaldo_bilhar
 */
public class NumeroRandomico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ale = Math.random();
        int n = (int)(5+ale*(10-5));
        System.out.println(ale);
        System.out.println(n);
    }
    
}
