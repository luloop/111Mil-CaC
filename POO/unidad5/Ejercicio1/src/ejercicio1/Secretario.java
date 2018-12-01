/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Secretario extends Empleado
{
    //<editor-fold desc="Atributos">

    protected boolean despacho;
    protected String numeroFax;
    protected static double incrementoAnual;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    static
    {
        incrementoAnual = 0.05;
    }

    public Secretario(String nombre, String apellido, String dni, String direccion, boolean despacho, String telefono, int salario, String fax)
    {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = fax;
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    @Override
    public String toString()
    {
        StringBuilder retorno = new StringBuilder();
        
        retorno.append(super.toString());

        retorno.append(" Fax: ").append(this.numeroFax);
        retorno.append(" \nDespacho: ").append(this.despacho);
        /* protected boolean despacho;
    protected String numeroFax;*/
        //terminar retorno

        return retorno.toString();
    }

    // </editor-fold>
}
