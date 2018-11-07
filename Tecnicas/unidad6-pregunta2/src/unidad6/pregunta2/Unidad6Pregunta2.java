/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6.pregunta2;

/**
 *
 * @author Usuario
 */
public class Unidad6Pregunta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int nInicial = 25;        
        // System.out.println(cuenta(nInicial));
        procBucle(20);

    }

    public static int cuenta(int nInicial) {
        return ((nInicial * 10) + 25);
    }

    public static void imprimirModulo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Módulo ejecutándose");
        }
    }

    public static void procBucle(int nFinal) 
    {
        for (int i = 0; i < nFinal; i++) 
        {
            System.out.println(i);
        }

      //  return i;

    }

}
