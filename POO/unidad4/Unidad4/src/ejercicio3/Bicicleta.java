/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author luloop
 */
public class Bicicleta
{

    //<editor-fold desc="Atributos">
    int velocidadActual;
    int platoActual;
    int piñonActual;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    public Bicicleta(int velocidadActual, int platoActual, int piñonActual)
    {
        this.velocidadActual = velocidadActual;
        if (platoActual > 0)
        {
            this.platoActual = platoActual;
        } else
        {
            this.platoActual = 1;
        }
        if (piñonActual > 0)
        {
            this.piñonActual = piñonActual;
        } else
        {
            this.piñonActual = 1;
        }

    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    public void acelerar()
    {
        if (this.velocidadActual > 0)
        {
            this.velocidadActual *= 2;
        }
    }

    public void frenar()
    {
        if (this.velocidadActual > 0)
        {
            this.velocidadActual /= 2;
        }
    }

    public void cambiarPlato()
    {
        this.platoActual = 1;
    }

    public void cambiarPlato(int plato)
    {
        if (plato > 0)
        {
            this.platoActual = plato;
        }
    }

    public void cambiarPiñon()
    {
        this.piñonActual = 1;
    }

    public void cambiarPiñon(int piñon)
    {
        if (piñon > 0)
        {
            this.piñonActual = piñon;
        }
    }

    // </editor-fold>
}
