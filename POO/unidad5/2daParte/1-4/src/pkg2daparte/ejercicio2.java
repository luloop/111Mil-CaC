/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2daparte;

import java.util.ArrayList;

/**
 *
 * @author luloop
 */
public class ejercicio2
{

    public static void main(String[] args)
    {
        ArrayList<Integer> numeros = new ArrayList();
        boolean flag1 = false, flag2 = false;
        int suma = 0, media = 0, maximo = 100, minimo = 0;
        for (int i = 0; i < 10; i++)
        {
        numeros.add((recursos.randoms.Entero(0, 100)));
            
        }
      
        for (Integer numero : numeros)
        {
            if (flag1 == false || numero > maximo)
            {
                maximo = numero;
                flag1 = true;
            }
            if (flag2 == false || numero < minimo)
            {
                minimo = numero;
                 flag2 = true;
            }
            suma += numero;
            media++;
            
            System.out.println(numero);

        }
        if (media != 0)
        {
            media = suma / media;
        }

        System.out.println("La media es " + media);
        System.out.println("\nLa suma es " + suma);
        System.out.println("\nEl maximo es  " + maximo);
        System.out.println("\nEl minimo es  " + minimo);

    }

}
