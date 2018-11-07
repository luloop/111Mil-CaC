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
public class ejercico3
{

    public static void main(String[] args)
    {
        int a, b;
        System.out.println("Ingrese el Valor de A");
        a = ejercicio1.consola.Int();
        
        System.out.println("Ingrese el Valor de B");
        b = ejercicio1.consola.Int();
        
        
        if (!(a < 0 || a > 20) && !(b < 0 || b > 20))
        {

            if (a > b)
            {
                System.out.println("el mayor es A");
            } else if (b > b)
            {
                System.out.println("el mayor es B");
            } else
            {
                System.out.println("Son iguales");
            }

        }

    }
}
