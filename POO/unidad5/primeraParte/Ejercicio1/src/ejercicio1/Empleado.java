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
public class Empleado
{

    //<editor-fold desc="Atributos">
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String direccion;
    protected int antiguedad;
    protected String telefono;
    protected int salario;
    protected Empleado supervisor;
    // </editor-fold>
    //<editor-fold desc="Constructores">

    public Empleado(String nombre, String apellido, String dni, String direccion, String telefono, int salario)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.antiguedad = 0;
        this.telefono = telefono;
        this.salario = salario;
    }

    // </editor-fold>    
    //<editor-fold desc="Metodo">
    @Override
    public String toString()
    {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nombre: ").append(this.nombre);
        retorno.append(" Apellido: ").append(this.apellido);
        retorno.append(" Dni: ").append(this.dni);
        retorno.append("\nDire: ").append(this.direccion);
        retorno.append(" Telefono: ").append(this.telefono);
        retorno.append("\nSalario: ").append(this.salario);
        retorno.append(" Antiguedad: ").append(this.antiguedad);
        return retorno.toString();
    }

    protected void cambiarSupervisor(Empleado supervisor)
    {
        this.supervisor = supervisor;
    }

    protected void incrementarSalario(int sumar)
    {
        this.salario += sumar;
    }

    // </editor-fold>  
}
