/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

/**
 *
 * @author Usuario
 */
public class AvesEnZoo
{

    protected String tipoDeAve;
    protected int numeroAves;
    protected int numeroMachos;
    protected int numeroHembras;

    public AvesEnZoo(String tipoDeAve, int numeroAves, int numeroMachos, int numeroHembras)
    {
        this.tipoDeAve = tipoDeAve;
        this.numeroAves = numeroAves;
        this.numeroMachos = numeroMachos;
        this.numeroHembras = numeroHembras;
    }

    @Override
    public String toString()
    {
        StringBuilder retorno = new StringBuilder();

        retorno.append(recursos.formato.tabParaListados(this.tipoDeAve, 10));
        retorno.append(recursos.formato.tabParaListados(this.numeroAves, 7));
        retorno.append(recursos.formato.tabParaListados(this.numeroMachos, 7));
        retorno.append(recursos.formato.tabParaListados(this.numeroHembras, 7));

        return retorno.toString();

    }

}
