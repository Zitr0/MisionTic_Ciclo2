
package tiposprimitivos;

/**
 *
 * @author jcortiz
 */
public class TiposPrimitivos {

    public static void main(String args[]) {
        /*
            tipo primitivos enteros: byte, short, int, long
        */
        
        byte numeroByte = 15;
        System.out.println("Valor minimo de byte " + Byte.MIN_VALUE);
        System.out.println("V0alor maximo de byte " + Byte.MAX_VALUE);
        
        short numeroShort = 1988;
        System.out.println("Valor minimo de short " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short " + Short.MAX_VALUE);
        
        
        int numeroInt = 150688;
        
        System.out.println("Valor minimo int " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int " + Integer.MAX_VALUE);
        
        long numeroLong = 150688;
        
        System.out.println("Valor minimo long " + Long.MIN_VALUE);
        System.out.println("Valor maximo long " + Long.MAX_VALUE);
        
        
        /*
            Tipo primitivo flotando: float, double
        */
        
        float numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        
        System.out.println("Valor minimo " + Float.MIN_VALUE);
        System.out.println("Valor maximo " + Float.MAX_VALUE);
        
        
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        
        System.out.println("Valor minimo " + Double.MIN_VALUE);
        System.out.println("Valor Maximo " + Double.MAX_VALUE);
        
    }
    
}
