/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2daparte;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author luloop
 */
public class ejercicio3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numeros = new ArrayList();

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Ingresar numero entero");
            numeros.add(recursos.consola.leerInt());
        }

       // numeros.sort(Ordenar);

        for (Integer numero : numeros)
        {
            System.out.println(numero);
            
        }
    }

            
 /*   public Comparator<Integer> Ordenar= (int cadena1, int cadena2) ->
    {
        int aux = 0;

        if (cadena1<cadena2)
        {
            aux = 1;

        } else if (cadena1>cadena2)
        {
            aux = -1;
        }

        return aux;
    };*/

}
