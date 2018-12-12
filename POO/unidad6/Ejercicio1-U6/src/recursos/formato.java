/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;


import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author luloop
 */
public class formato
{

    public static String tabParaListados(String cadena, int cantidad)
    {
        StringBuilder aux = new StringBuilder();

        aux.append("|| ");

        for (int i = 0; i < cantidad; i++)
        {
            if (cadena.length() <= i)
            {
                aux.append(" ");
            } else
            {
                aux.append(cadena.charAt(i));
            }
        }

        return aux.toString();
    }

    public static String tabParaListados(float cadena, int cantidad)
    {
        DecimalFormat df = new DecimalFormat();
        String aux;
        df.setMaximumFractionDigits(cantidad);
        aux = "|| ";
        aux += df.format(cadena);

        return aux;
    }

   /* public static void listadoMatriz(ArrayList<Llamada> lista, int cantColumnas)
    {
        StringBuilder aux = new StringBuilder();


        for (int i = 0; i < 70 * 10; i++)
        {
            for (int j = 0; j < 70; j++)
            {
               
                if(j%10==0)
                {
                  aux.append("|");
                    System.out.println(aux);
                }
                else
                    System.out.println(" ");

            }

        }

    }*/

}
