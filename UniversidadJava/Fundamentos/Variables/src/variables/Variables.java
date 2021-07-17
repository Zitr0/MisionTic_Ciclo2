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
public class Variables {

   public static void main( String a[]){
       
       // Primero se especifica el tipo
       
       int miVariableEntera = 10;
       
       System.out.println(miVariableEntera);
       
       //Se modifica el valor de la variable
       miVariableEntera = 5;
       
       System.out.println(miVariableEntera);
       
       String miVariableTexto = "Camilo";
       
       System.out.println("Mi nombre es " + miVariableTexto);
       
       miVariableTexto = "Juan";
       
       System.out.println("y el primer nombre es " + miVariableTexto);
           
       // var  - Inferencia de tipos de datos en Java
       
       /*
       var miVariable = 25;
       
       System.out.println(miVariable);
       
       var miVariableTextos = "PruebaTexto";
       
       System.out.println(miVariableTextos);
       */
       
       // Reglas variables
       /*
            sin numeros o caracteres especiales al inicio
            no utilizar acentos
            por convención la primer letra en minuscula
            se puede utilizar guion bajo y signo pesos
       */
       
       
       
   } 
}
