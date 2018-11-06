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
public class ejercicio4
{

    public static void main(String[] args)
    {
        int a, b, c;

        System.out.println("Ingrese el Valor de a");
        a = ejercicio1.consola.Int();
        System.out.println("Ingrese el Valor de b");
        b = ejercicio1.consola.Int();
        while (b == a)
        {
            System.out.println("Debe ser disinto de A");
            b = ejercicio1.consola.Int();
        }

        System.out.println("Ingrese el Valor de C");
        c = ejercicio1.consola.Int();
        while (c == a || c==b)
        {
            System.out.println("Debe ser disinto de A y B");
            c = ejercicio1.consola.Int();
        }

        if (a > b && a > c)
        {
            System.out.println("El mayor es A");
        } else if (c > b && c > a)
        {
            System.out.println("El mayor es C");
        }
       else if (b > a && b > c)
        {
            System.out.println("El mayor es B");
        }

    }
}
