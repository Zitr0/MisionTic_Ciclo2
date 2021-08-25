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
public class Unarios {
    
    public static void main(String args[])
    {
        int a = 3;
        int b = -a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        boolean c = true;
        boolean d = !c;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // Incremento
        //1. Pre incremento (simbolo antes de la variable)
        
        int e = 3;
        int f = ++e; //Primero se incrementa la variable y despues se usa su valor
        
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2. Post incremento (simbolo despues de la variable)
        
        int g = 5;
        int h = g++; //Primero se utiliza el valor y despues se incrementa la variable
        
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
         // decremento
        //1. Pre decremento (simbolo antes de la variable)
        
        int i = 3;
        int j = ++i; //Primero se decrementa la variable y despues se usa su valor
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2. Post decremento (simbolo despues de la variable)
        
        int k = 5;
        int l = k++; //Primero se utiliza el valor y despues se decrementa la variable
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    
    }
    
}
