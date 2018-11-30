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
public class Ejercicio1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Secretario secretario1 = new Secretario("Pepe", "Rizzi", "30887699", "Casa 1123", true, "1111111111", 0, "2222222");
        JefeDeZona nuevoJefe = new JefeDeZona(true, secretario1, "Honda", "AAA000", "2015", "Jefe", "Zona", "12345678", "la casa del jefe", "1111555555", 1500);
        Vendedor vendedor1 = new Vendedor("lolo", "222aaaa", "2005", "1565556666", "CABA", 150000, "lool", "#poool", "123654", "direccion", "telefono", 0);
        Vendedor vendedor2 = new Vendedor("lolo", "222aaaa", "2005", "1565556666", "CABA", 150000, "lool", "#poool", "123654", "direccion", "telefono", 0);
        Vendedor vendedor3 = new Vendedor("lolo", "222aaaa", "2005", "1565556666", "CABA", 150000, "lool", "#poool", "123654", "direccion", "telefono", 0);

        nuevoJefe.AgregarVendedor(vendedor3);
        nuevoJefe.AgregarVendedor(vendedor1);
        nuevoJefe.AgregarVendedor(vendedor2);
        vendedor3.incrementarSalario(100);
        
        System.out.println(nuevoJefe.toString());
    }

}
