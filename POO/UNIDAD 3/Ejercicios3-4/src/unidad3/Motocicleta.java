
package unidad3;

public class Motocicleta
{

    //<editor-fold desc="Atributos">
    public String matricula;
    public String color;
    public int velocidad;
    public boolean en_marcha;
    // </editor-fold>
    //<editor-fold desc="Constructores">

    public Motocicleta()
    {
        this.velocidad = 0;
        this.en_marcha = false;
    }

    public Motocicleta(String matricula, String color, int velocidad, boolean en_marcha)
    {
        this();
        this.matricula = matricula;
        this.color = color;

    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    public void Acelerar()
    {
       this.velocidad+=10;
    }

    public void Frenar()
    {
        this.velocidad = 0;
    }

    public void Arrancar()
    {
        this.en_marcha = true;
    }

    public void Gira()
    {
     // no tiene direccion
    }

    // </editor-fold>
}
