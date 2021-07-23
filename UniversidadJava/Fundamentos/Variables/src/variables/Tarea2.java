/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author jcortiz
 */

import java.util.Scanner;

public class Tarea2 {
    
    public static void main(String a[]){
    
        Scanner capturar = new Scanner(System.in);
    
        System.out.println("Proporcionar el titulo:");
        String titulo = capturar.nextLine();
        System.out.println("Proporciona el autor");
        String autor = capturar.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
        
    }
    
}
