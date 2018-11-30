/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Vendedor extends Empleado
{

    //<editor-fold desc="Atributos">
    protected String marcaAuto;
    protected String patenteAuto;
    protected String modeloAuto;
    protected String telefonoMovil;
    protected String areaVenta;
    protected float porcetanje;
    protected static double incremSalario;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    static
    {
        incremSalario = 0.10;
    }

    public Vendedor(String marcaAuto, String patenteAuto, String modeloAuto, String telefonoMovil, String areaVenta, float porcetanje, String nombre, String apellido, String dni, String direccion, String telefono, int salario)
    {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.marcaAuto = marcaAuto;
        this.patenteAuto = patenteAuto;
        this.modeloAuto = modeloAuto;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.porcetanje = porcetanje;
    }

    // </editor-fold>    
    //<editor-fold desc="Metodo">
    public void cambiarAuto(String marca, String patente, String modelo)
    {
        this.marcaAuto = marca;
        this.patenteAuto = patente;
        this.modeloAuto = modelo;

    }

    @Override
    public String toString()
    {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n VENDEDOR \n");
        retorno.append(super.toString());
        
        //terminar retorno

        return retorno.toString();
    }

    // </editor-fold>
}
