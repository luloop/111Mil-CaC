/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;
import java.util.Scanner;
/**
 *
 * @author jlfum
 */
 
class Array3 {
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
 
        int[] datos = new int[5];
        for (int i=0; i<5; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextInt();
        }
 
        for (int i=4; i>=0; i--)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );
        }
    }
}
 

    
