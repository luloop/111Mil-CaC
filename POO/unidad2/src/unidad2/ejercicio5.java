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
public class ejercicio5
{

    public static void main(String[] args)
    {
 int a, b, c;

        System.out.println("Ingrese el Valor de a");
        a = ejercicio1.consola.Int();
        System.out.println("Ingrese el Valor de b");
        b = ejercicio1.consola.Int();
        System.out.println("Ingrese el Valor de C");
        c = ejercicio1.consola.Int();
       
        if (a<0)
            System.out.println("el producto es " + (a*b*c));
        else
            System.out.println("la suma es " + (a+b+c));
        
    }

}
