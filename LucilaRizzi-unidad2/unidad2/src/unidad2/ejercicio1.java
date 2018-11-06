/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio1
{

    public static void main(String[] args)
    {
        int a, b;
        System.out.println("Ingrese el Valor de a");
        a = consola.Int();
        System.out.println("Ingrese el Valor de b");
        b = consola.Int();

        int aux;
        
        aux = a;
        a = b;
        b = aux;

        System.out.println("A:" + a + " B:" + b);
    }

    public static class consola
    {

        public static String String()
        {

            Scanner lector = new Scanner(System.in);
            String aux;
            aux = lector.next();

            return aux;
        }

        public static int Int()
        {
            Scanner lector = new Scanner(System.in);
            int aux = -1;
            String Ingresado;
            Ingresado = lector.next();

            try
            {
                aux = Integer.parseInt(Ingresado);
            } catch (NumberFormatException nfe)
            {

            }

            return aux;
        }

        public static float Float()
        {
            Scanner lector = new Scanner(System.in);
            float aux = -1;
            String Ingresado;
            Ingresado = lector.next();

            try
            {
                aux = Float.parseFloat(Ingresado);
            } catch (NumberFormatException nfe)
            {

            }

            return aux;

        }

    }

}
