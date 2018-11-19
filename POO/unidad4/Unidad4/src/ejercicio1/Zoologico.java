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
public class Zoologico

{

    //<editor-fold desc="Atributos">
    public static int CANTIDAD_ANIMALES = 25;
    public static int RACIONES_POR_ANIMAL = 5;
    private boolean abierto;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    public Zoologico()
    {

    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    public boolean abrir()
    {
        if (this.abierto == false)
        {
            this.abierto = true;
        }
        return this.abierto;
    }

    public boolean cerrar()
    {
        boolean resp = false;
        if (this.abierto == true)
        {
            this.abierto = false;
            resp = true;
        }
        return resp;
    }

    public boolean alimentarAnimales(int unaCantidadDeRaciones)
    {

        boolean resp = false;

        if (this.abierto == true)
        {
            Cuidador nuevoCuidador = new Cuidador(unaCantidadDeRaciones);

            if (unaCantidadDeRaciones >= (CANTIDAD_ANIMALES * RACIONES_POR_ANIMAL) && this.abierto == true);
            {
                resp = true;
            }
        }

        return resp;
    }

    // </editor-fold>
}
