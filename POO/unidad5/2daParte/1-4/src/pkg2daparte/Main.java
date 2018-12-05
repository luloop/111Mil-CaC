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
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList <String> nombres = new ArrayList();
        nombres.add("Pedro");
        nombres.add("Pablo");
        nombres.add("Luis");
        nombres.add("Daniel");
                
        for (String nombre : nombres)
        {
            System.out.println(nombre);
        }
                
        }

}
