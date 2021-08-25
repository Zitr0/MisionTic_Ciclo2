/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author jcortiz
 */
public class Asignacion {
    
    public static void main(String args[]){
        
        int a = 3, b=2;
        int c = a + 5 - b;
        
        System.out.println(c);
        
         a += 1;
         
         System.out.println("a = " + a);
         
         a += 3;
         
         System.out.println("a = " + a);
         
         a -= 2;
         
         System.out.println("a = " + a);
         
         a *= a;
         
         System.out.println("a = " + a);
         
         a /= 2;
         
         System.out.println("a = " + a);
    
    }
    
}
