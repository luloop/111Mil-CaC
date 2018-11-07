
package DiscoMusical;

public class DiscoMusical
{

    //<editor-fold desc="Atributos">
    private String titulo;
    private String autor;
    private int anio;
    private String formato;
    private boolean digital;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    public DiscoMusical(String titulo, String autor, int anio, String formato, boolean digital)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.formato = formato;
        this.digital = digital;
    }
    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    /**
     * @return the titulo
     */
    public String getTitulo()
    {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor()
    {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    /**
     * @return the anio
     */
    public int getAnio()
    {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    /**
     * @return the formato
     */
    public String getFormato()
    {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato)
    {
        this.formato = formato;
    }

    /**
     * @return the digital
     */
    public boolean isDigital()
    {
        return digital;
    }

    /**
     * @param digital the digital to set
     */
    public void setDigital(boolean digital)
    {
        this.digital = digital;
    }
    //</editor-fold>
    //<editor-fold desc="Metodo">
    // </editor-fold>


}
