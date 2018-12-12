/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.u6;

/**
 *
 * @author capacita_mecon
 */
public class ejercicio5U6
{

    public static void main(String[] args)
    {
        boolean continuar = true;
        while (continuar)
        {
            try
            {
                System.out.print("Introduce un número entero: ");
                String cadenaDatos = recursos.consola.leerString();
                int numero = Integer.parseInt(cadenaDatos);
                System.out.println("el dato ingresado es " + numero);
                continuar = false;
            } catch (NumberFormatException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}


