/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class GrupoDeAves implements Iterator<AvesEnZoo>
{

    private ArrayList<AvesEnZoo> lista;
    protected int posicionarray;

    public GrupoDeAves()
    {
        this.lista = new ArrayList();
    }

    public boolean hasNext()
    {
        boolean result;
        if (posicionarray < this.getLista().size())
        {
            result = true;
        } else
        {
            result = false;
        }
        return result;
    }

    /*Un método next() que devuelve el siguiente elemento dentro de la colección*/
    public AvesEnZoo next()
    {
        posicionarray++;
        return getLista().get(posicionarray - 1);
    }

    public ArrayList<AvesEnZoo> getLista()
    {
        return lista;
    }

    public void setLista(ArrayList<AvesEnZoo> lista)
    {
        this.lista = lista;
    }

  /*  public Iterator<AvesEnZoo> iterator()
    {
        Iterator it = new IteratorAvesEnZoo();
        return it;
    }*/
}
