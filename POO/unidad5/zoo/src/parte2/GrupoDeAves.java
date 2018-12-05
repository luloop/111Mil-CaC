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

    private AvesEnZoo[] lista;
    protected static int posicionarray = 0;

    public GrupoDeAves(AvesEnZoo[] avesTodas)
    {
        this.lista = avesTodas;
    }

    public boolean hasNext()
    {
        boolean result;
        if (posicionarray < this.lista.length)
        {
            result = true;
        } else
        {
            result = false;
            posicionarray = 0;
        }
        return result;
    }

    /*Un método next() que devuelve el siguiente elemento dentro de la colección*/
    public AvesEnZoo next()
    {
        posicionarray++;
        return this.lista[posicionarray - 1];
    }

    /*  public Iterator<AvesEnZoo> iterator()
    {
        Iterator it = new IteratorAvesEnZoo();
        return it;
    }*/
}
