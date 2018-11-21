/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author luloop
 */
public abstract class Persona
{
    //<editor-fold desc="Atributos">
    private String nombre;
    private LocalDate fechaDeNacimiento;
    // </editor-fold>
    
    //<editor-fold desc="Constructores">

    public Persona()
    {
       
    }
    public Persona(String nombre, LocalDate fechaDeNacimiento)
    {
        this.nombre = nombre;
        //this.fechaDeNacimiento = new LocalDate(fechaDeNacimiento);
    }
    
   
    // </editor-fold>   
    
    //<editor-fold desc="Get-Set">
    
        public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento()
    {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento)
    {
        this.fechaDeNacimiento = fechaDeNacimiento;
    } 
    
    
    
    
    //</editor-fold>
    //<editor-fold desc="Metodo">
    // </editor-fold>

    
}
