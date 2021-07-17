/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcortiz
 */
public class Principal {

    public static void main(String a[]) {

        String texto1 = "Primer texto";
        String texto2 = "Segundo texto";
        String textoConcatenado = texto1 + " " + texto2;

        System.out.println(textoConcatenado);
        
        int enteroUno = 15;
        int enteroDos = 22;
        
        int calcularEntero = enteroUno + enteroDos;
        System.out.println("La suma de " + enteroUno + " + " + enteroDos + " = " + calcularEntero);
        
        calcularEntero = enteroUno - enteroDos;
        System.out.println("La resta de " + enteroUno + " - " + enteroDos + " = " + calcularEntero);
        
        calcularEntero = enteroUno * enteroDos;
        System.out.println("La multiplicacion de " + enteroUno + " * " + enteroDos + " = " + calcularEntero);
        
        calcularEntero = enteroUno / enteroDos;
        System.out.println("La Division de " + enteroUno + " / " + enteroDos + " = " + calcularEntero);        

        System.out.println(texto2 + (enteroUno + enteroDos) + texto1);
        
        // Salto de linea
        System.out.println("El primer texto es: \n" + texto1);
        
        //Tabulador
        System.out.println("El texto es: \t" + texto1);
        
        //Comillas simples
        System.out.println("El texto es: \'" + texto1 + "\'");
        

        //Comillas dobles
        System.out.println("El texto es: \"" + texto1 + "\"");
    }

}
