/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camiloortiz.sesion3;

import java.util.Scanner;

/**
 *
 * @author jcortiz
 */
public class Principal {
    public static void main(String a[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite un número: ");
        float n1 = input.nextFloat();
        System.out.println("Digite otro número: ");
        float n2 = input.nextFloat();
        
        float resultado = n1 + n2;
        
        System.out.println("El resultado es " + resultado);
        
        
        if( n2 == 0){
        
            System.out.println("Pongale cero");
        }
        else{
            resultado = n1 / n2;
            System.out.println("Dividir " + n1 + " % " + n2 + " = " + resultado);
                    
        }
        
        etapaDeLaVida();
    
    }    
    
    static void etapaDeLaVida(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Digite su edad");
        int edad = input.nextInt();
        
        if (edad >= 0 && edad <=10){
            System.out.println("Eres un niño"); 
        }
        else if (edad >= 11 && edad <= 17){
            System.out.println("Es una edad dificil");
        }
        else if (edad >= 18 && edad <= 35){
            System.out.println("Es una buena edad");
        }
        else if (edad >= 36 && edad <= 65){
            System.out.println("Es una edad de renovacion");
        }
        else if (edad >= 66 && edad >= 110){
            System.out.println("Ya estas pensionado");
        }
        else{
            System.out.println("Tienes una edad muy rara");
        }
        
    
    }   
    
}
