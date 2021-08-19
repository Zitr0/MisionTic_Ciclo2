/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author jcortiz
 */
public class Tarea3 {
    
    public static void main(String a[]){
          
        Scanner capturar = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre:");
        String nombre = capturar.nextLine();
        
        System.out.println("Proporciona el id:");
        int id = capturar.nextInt();
        
        System.out.println("Proporciona el precio:");
        double precio = capturar.nextDouble();
        
        System.out.println("Proporciona el precio:");
        boolean envioGratuito = capturar.nextBoolean();
        
        System.out.println(nombre + " #"+ id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito:" + envioGratuito);
        
             
    }
    
    
}
