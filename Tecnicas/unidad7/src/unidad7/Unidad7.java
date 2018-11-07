/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Unidad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String cadena = "Dos parámetros String, el primero son los caracteres que \nexiste en el String y el segundo por el que queremos cambiar";
        System.out.println(cadena);
        
        String cadenacopy = cadena.substring(5, 15);
        
        for (int i = 0; i < cadenacopy.length(); i++) 
        {
            System.out.println(cadenacopy.charAt(i)+"\n");
            
        }
        
        
        
        
        
        
        
        
        
          /*      
                
        int cantidadDeIngresos;

        System.out.println("------------------------------------");
        System.out.println("Ingrese la cantidad de numeros que desea cargar");
        System.out.println("------------------------------------");
        cantidadDeIngresos = leerConsolaInt();

        int[] array = new int[cantidadDeIngresos];

        for (int i = 0; i < array.length; i++) 
        {
            System.out.println("Ingrese el numero correposndiente a la posicion " + i);
            array[i] = leerConsolaInt();
        }

        for (int i = 0; i < array.length; i++) 
        {
            System.out.println("Ingreso el numero " + array[i] + " en la posicion " + i);

        }*/
    }

    public static int leerConsolaInt() 
    {
        Scanner lector = new Scanner(System.in);
        int aux;
        aux = lector.nextInt();

        return aux;
    }

}
