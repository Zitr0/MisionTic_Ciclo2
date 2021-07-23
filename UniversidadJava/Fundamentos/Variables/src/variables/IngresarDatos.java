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
public class IngresarDatos {
    public static void main(String a[]){
        
        Scanner capturar = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = capturar.nextLine();
        
        System.out.println("Ingrese su apellido:");
        String apellido = capturar.nextLine();
        
        System.out.println("Hola, " + nombre + " " + apellido + " gracias por estar aca");
                
    }
    
}
