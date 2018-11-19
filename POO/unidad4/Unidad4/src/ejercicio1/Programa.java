/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author luloop
 */
public class Programa
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Zoologico nuevoZoo = new Zoologico();

        if (nuevoZoo.abrir())
        {
            System.out.println("El zoo esta abierto");
        }

        if (nuevoZoo.alimentarAnimales(300))
        {
            System.out.println("La comida fue suficiente");
        }

        if (nuevoZoo.cerrar())
        {
            System.out.println("ZOO CERRADO");
        }

    }

}
