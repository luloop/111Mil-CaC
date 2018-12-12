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
public class ejercicio4U6 extends Exception
{
    String cadena;
    
    public static void main(String[] args)
    {  
        try
        {
            throw new ejercicio4U6("Hola hola");            
        } 
        
        catch (ejercicio4U6 e)
        {
            System.out.println(e.mostrarString());
        }           
    }
    
    

    /**
     * Constructs an instance of <code>ejercicio4U6</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ejercicio4U6(String msg)
    {
        super("Ejercicio 4 unidad 6");
        this.cadena= msg;
    }
    
    public String mostrarString ()
    {
        return this.cadena;
    }
    
    
}
