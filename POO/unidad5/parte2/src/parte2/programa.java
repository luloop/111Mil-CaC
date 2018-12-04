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
       

        AvesEnZoo ave1 = new AvesEnZoo("LOla", 20, 15, 10);
        AvesEnZoo ave2 = new AvesEnZoo("LOle", 20, 15, 10);
        AvesEnZoo ave3 = new AvesEnZoo("LOli", 20, 15, 10);
        AvesEnZoo ave4 = new AvesEnZoo("LOlo", 20, 15, 10);
        
        GrupoDeAves nuevoGrupo = new GrupoDeAves();
        
       nuevoGrupo.getLista().add(ave1);
       nuevoGrupo.getLista().add(ave2);
       nuevoGrupo.getLista().add(ave3);
       nuevoGrupo.getLista().add(ave4);


        Iterator<AvesEnZoo> iterador = new Iterator();
        
        while (iterador.hasNext())
        {
            System.out.println(iterador.next().toString());
        }

    }

   
}
