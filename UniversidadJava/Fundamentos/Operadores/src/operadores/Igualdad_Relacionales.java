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
public class Igualdad_Relacionales {

    public static void main(String args[]) {

        int a = 3, b = 2;

        // igualdad ==
        boolean c = (a == b);

        System.out.println(c);

        // diferente 
        boolean d = a != b;

        System.out.println(d);

        String cadenaUno = "Hola";
        String cadenaDos = "Hola";

        boolean e = cadenaUno == cadenaDos; // Se compara la referencia de objetos

        System.out.println("e = " + e);

        boolean f = cadenaUno.equals(cadenaDos); // Comparar contenido de cadenas

        System.out.println("f = " + f);

        //Operadores relacionales
        boolean g = a >= b; // mayor que >  mayor o igual >=

        System.out.println("g = " + g);

        if (b % 2 == 0) {
            System.out.println("es par = " + b);
        } else {
            System.out.println("es impar = " + b);
        }
        
        int edad = 17;
        int adulto = 18;
        
        if(edad >= adulto ){
            System.out.println("Ya es adulto");
        } else {
            System.out.println("Es menor de edad");
        }
       
        

    }

}
