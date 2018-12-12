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
public class ejercicio3U6 extends Exception
{
    public static void main(String[] args) throws ejercicio3U6
    {
        try
        {
            throw new ejercicio3U6("Argumento de la excepcion");
            
        } catch (ejercicio3U6 e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finalizo el programa");
        }
    }
    
    public ejercicio3U6(String msg)
    {
        super(msg);
    }
}
