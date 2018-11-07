/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author jlfum
 */
public class Array1
{

    public static void main(String args[])
    {
        double[] a =
        {
            10, 23.5, 15, 7, 8.9
        };
        double total = 0;
        int i;

        for (i = 0; i < 5; i++)
        {
            total += a[i];
        }

        System.out.println("La media es:");
        System.out.println(total / 5);
    }
}

/**
 * @param args the command line arguments
 */
