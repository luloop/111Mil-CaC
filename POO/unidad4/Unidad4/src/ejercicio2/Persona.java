/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Random;

/**
 *
 * @author luloop
 */
public class Persona
{

    //<editor-fold desc="Atributos">
    private String nombre;
    private int edad;
    private double DNI;
    private char sexo;
    // </editor-fold>

    //<editor-fold desc="Constructores">    
    public Persona()
    {
        this.edad = 0;
        this.nombre = " ";
        this.sexo = 'H';
        this.DNI = generaDNI();

    }

    public Persona(String nombre, int edad, char sexo)
    {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);

    }

    public Persona(String nombre, int edad, double DNI, char sexo)
    {
        this(nombre, edad, sexo);
        this.DNI = DNI;

    }

    // </editor-fold>   
    //<editor-fold desc="Get-Set">
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    //</editor-fold>
    //<editor-fold desc="Metodo">
    /**
     * indica si es mayor de edad, devuelve un booleano
     */
    public boolean esMayorDeEdad()
    {
        boolean resp = false;
        if (this.edad > 17)
        {
            resp = true;
        }
        return resp;
    }

    /**
     * Comprueba que el sexo introducido es correcto. } Si no es correcto, será
     * H. No sera visible al exterior.
     */
    private char comprobarSexo(char sexo)
    {
        char resp = 'H';
        if ("H".equals(this.nombre) || "M".equals(this.nombre))
        {
            resp = this.sexo;
        }
        return resp;
    }

    /**
     * devuelve toda la información del objeto.
     */
    public String toString()
    {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nombre ").append(this.nombre);
        retorno.append(" Edad ").append(this.edad);
        retorno.append(" Sexo ").append(this.sexo);
        retorno.append(" DNI ").append(this.DNI);

        return retorno.toString();

    }

    /**
     * genera un número aleatorio de 8 cifras, genera a partir de este su número
     *
     */
    private double generaDNI()
    {
        Random random = new Random();
        double aux = 10000000 + (99999999 - 10000000) * random.nextDouble();
        return aux;

    }

//</editor-fold>
}
