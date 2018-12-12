/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.u6;

import java.util.Scanner;

/**
 *
 * @author luloop
 */
public class Ejercicio2U6
{

    public static void main(String[] args)
    {
        String lector = "M";
        int aux;
        System.out.println("Intentamos ejecutar el bloque de instrucciones:");

        try
        {
            System.out.println("Intruccion 1.");
            aux = Integer.parseInt(lector);
        } catch (NumberFormatException nfe)
        {

            System.out.println("Intruccion a ejecutar cuando se produce el error");
        } finally
        {
            System.out.println("Instrucciones a ejecutar finalmente tanto si se produce errores como si no");
        }

    }

}
