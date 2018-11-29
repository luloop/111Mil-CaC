package unidad3;

public class Empleado
{
    //<editor-fold desc="Atributos">

    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    public Empleado()
    {
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario)
    {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return this.nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula()
    {
        return this.cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return this.edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad)
    {
        if (edad > 17 && edad <= 45)
        {
            this.edad = edad;
        } else
        {
            this.edad = -1;
        }

    }

    /**
     * @return the casado
     */
    public boolean isCasado()
    {
        return this.casado;
    }

    /**
     * @param casado the casado to set
     */
    public void setCasado(boolean casado)
    {
        this.casado = casado;
    }

    /**
     * @return the salario
     */
    public double getSalario()
    {
        return this.salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    //</editor-fold>
    //<editor-fold desc="Metodo">
    public void clasificarPorEdad()
    {
        if (this.edad <= 21)
        {
            System.out.println("Es Principiante");
        } else if (this.edad > 21 && this.edad <= 35)
        {
            System.out.println("Es Intermedio");
        } else
        {

            System.out.println("Es Senior");
        }

    }

    public void mostrar()
    {
        StringBuilder retorno = new StringBuilder();

        retorno.append(recursos.formato.tabParaListados(this.nombre, 10));
        retorno.append(recursos.formato.tabParaListados(this.cedula, 10));
        retorno.append(recursos.formato.tabParaListados(this.edad, 10));
        retorno.append(recursos.formato.tabParaListados(this.casado, 10));
        retorno.append(recursos.formato.tabParaListados(this.salario, 10));

        System.out.println(retorno);

    }

    public void aumeentarSalario(int aumento)
    {
        if (aumento > 0)
        {
            this.salario += this.salario * ((double) aumento / 100);
        }
    }

    // </editor-fold>
}
