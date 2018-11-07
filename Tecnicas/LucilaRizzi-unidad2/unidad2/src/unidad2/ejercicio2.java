/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author Usuario
 */
public class ejercicio2
{

    public static void main(String[] args)
    {
        int a, b;
        System.out.println("Ingrese el Valor de a");
        a = ejercicio1.consola.Int();
        System.out.println("Ingrese el Valor de b");
        b = ejercicio1.consola.Int();

        System.out.println("Suma:" + (a + b));
        System.out.println("Resta:" + (a - b));
        System.out.println("Multiplicacion:" + (a + b));
        if (a != 0)
        {
            System.out.println("Division:" + (a/b));
        } 
        else
        {
            System.out.println("no se puede divir cero");
        }

    }

}
