/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;

public class JefeDeZona extends Empleado
{

    protected boolean despacho;
    protected Secretario secretario;
    protected ArrayList<Vendedor> vendedores;
    protected String marcaAuto;
    protected String patenteAuto;
    protected String modeloAuto;

    private JefeDeZona(String nombre, String apellido, String dni, String direccion, String telefono, int salario)
    {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.vendedores = new ArrayList();
    }

    public JefeDeZona(boolean despacho, Secretario secretario, String marcaAuto, String patenteAuto, String modeloAuto, String nombre, String apellido, String dni, String direccion, String telefono, int salario)
    {
        this(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.marcaAuto = marcaAuto;
        this.patenteAuto = patenteAuto;
        this.modeloAuto = modeloAuto;
    }

    public void AgregarVendedor(Vendedor vendedor)
    {
        if(!this.vendedores.contains(vendedor))
        this.vendedores.add(vendedor);

    }
    
    public void EliminarVendedor(Vendedor vendedor)
    {
        if(this.vendedores.contains(vendedor))
        this.vendedores.remove(vendedor);

    }

    public void CambiarSecretario(Secretario nuevoSec)
    {
        this.secretario = nuevoSec;
    }

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
        retorno.append(super.toString());
        retorno.append("Jefe");
        retorno.append(this.secretario.toString());
        
        for (Vendedor vendedore : vendedores)
        {
            retorno.append(vendedore.toString());
        }
        //terminar retorno

        return retorno.toString();
    }
    
    
}
