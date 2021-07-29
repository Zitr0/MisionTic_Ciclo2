/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author jcortiz
 */

import java.util.Scanner;

public class ConversionTipos {
    
    //Conversion de string a entero
    public static void main(String a[]){
    
            String edad = "33";
            int edadEntero = Integer.parseInt(edad);
            System.out.println(edadEntero);
            
            //Calculo con valores ingresados
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Ingresar un numero");
            
            String numeroUno = entrada.nextLine();
            
            System.out.println("Ingrese otro numero");
            
            String numeroDos = entrada.nextLine();
            
            System.out.println("Los numeros ingresados son " + numeroUno + " y " + numeroDos);
            
            int numeroUnoInt = Integer.parseInt(numeroUno);
            int numeroDosInt = Integer.parseInt(numeroDos);
            
            sumarNumero(numeroUnoInt, numeroDosInt);
            
            
            
     
    }
    
    public static int sumarNumero(int a, int b){
         
        System.out.println("La suma de los numeros es "+ (a+b));
        return a + b;
        
    }
    
    
}
