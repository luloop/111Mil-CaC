/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.u6;

/**
 *
 * @author luloop
 */
public class Ejercicio1U6 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Intentamos ejecutar el bloque de instrucciones:");

        try
        {
            f1();
        } catch (Exception lolo)
        {
            System.out.println(lolo.getMessage());
        } finally
        {
            System.out.println("Instrucciones a ejecutar finalmente tanto si se produce errores como si no");
        }

    }

    public static void f1() throws Exception
    {
        try
        {
            f2();

        } catch (Exception nfe)
        {
            throw new Exception("Intruccion 1." + nfe.getMessage());
        }

    }

    public static void f2() throws Exception
    {
        try
        {
            f3();

        } catch (Exception nfe)
        {
            throw new Exception("\nIntruccion 2." + nfe.getMessage());
        }

    }

    public static void f3() throws Exception
    {

        throw new Exception("\nIntruccion 3, etc ");

    }

}
