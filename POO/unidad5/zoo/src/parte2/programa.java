/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class programa
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        AvesEnZoo ave1 = new AvesEnZoo("Aguila", 35, 10, 25);
        AvesEnZoo ave2 = new AvesEnZoo("Buitres", 100, 55, 45);
        AvesEnZoo ave3 = new AvesEnZoo("Halcones", 80, 25, 55);
      
        AvesEnZoo[] avesEnZoo ={ave1, ave2, ave3};

        GrupoDeAves nuevoGrupo = new GrupoDeAves(avesEnZoo);

        Iterator<AvesEnZoo> iterador = nuevoGrupo;
        
        mostrarIterador(iterador);

    }

    public static void mostrarIterador(Iterator<AvesEnZoo> iterador)
    {
        if (iterador.hasNext())
        {
                System.out.print(recursos.formato.tabParaListados("TIPO",10));
        System.out.print(recursos.formato.tabParaListados("TOTAL" ,7));
        System.out.print(recursos.formato.tabParaListados("MACHOS",7));
        System.out.print(recursos.formato.tabParaListados("HEMBRAS",7));

            
            System.out.println();
            while (iterador.hasNext())
            {
                System.out.println(iterador.next().toString());
            }
        }
    }

}
