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
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // aritmeticos
        int a=3,b=2;
               
        int resultado = a + b;
       
        System.out.println("resultado suma =" + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        
        double resultad =  (double)a/b;
        
        System.out.println("resultado division = " + resultad);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        if(a % 2 == 0){
            System.out.println(a + " Es numero par");
        }else{
            System.out.println(a + " Es numero impar");
        }
        
        if(b % 2 == 0){
            System.out.println(b + " Es numero par");
        }else{
            System.out.println(b + " Es numero impar");
        }
    }
    
}
