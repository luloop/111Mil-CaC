/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author luloop
 */
public class Cuenta
{

    //<editor-fold desc="Atributos">
    private String titular;
    private double cantidad;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    public Cuenta(String titular)
    {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad)
    {
        this(titular);
        this.cantidad = cantidad;
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    public String getTitular()
    {
        return this.titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    public double getCantidad()
    {
        return this.cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    //</editor-fold>
    //<editor-fold desc="Metodo">
    public void ingresar(double cant)
    {
        if (cant >= 0)
        {
            this.cantidad = cant;
        }

    }

    public void retirar(double cant)
    {
        if (cant >= 0)
        {

            if (cant >= this.cantidad)
            {
                this.cantidad = 0;
            } else
            {
                this.cantidad -= cant;
            }
        }

    }

    // </editor-fold>
}
