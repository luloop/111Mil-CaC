/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

/**
 *
 * @author Usuario
 */
public class UNIDAD3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Empleado nuevoEmpleado = new Empleado(recursos.randoms.Nombre(), recursos.randoms.Apellido(), recursos.randoms.Entero(18, 45), Boolean.FALSE, 10000);
        Empleado nuevoEmpleado2 = new Empleado(recursos.randoms.Nombre(), recursos.randoms.Apellido(), recursos.randoms.Entero(18, 45), Boolean.FALSE, 20000);
        Empleado nuevoEmpleado3 = new Empleado(recursos.randoms.Nombre(), recursos.randoms.Apellido(), recursos.randoms.Entero(18, 45), Boolean.FALSE, 50000);

        StringBuilder retorno = new StringBuilder();

        retorno.append(recursos.formato.tabParaListados("Nombre", 10));
        retorno.append(recursos.formato.tabParaListados("Cedula", 10));
        retorno.append(recursos.formato.tabParaListados("Edad", 10));
        retorno.append(recursos.formato.tabParaListados("Casado", 10));
        retorno.append(recursos.formato.tabParaListados("Salario", 10));
        System.out.println(retorno);

        nuevoEmpleado.mostrar();
        nuevoEmpleado2.mostrar();
        nuevoEmpleado3.mostrar();

        nuevoEmpleado.aumeentarSalario(20);

        nuevoEmpleado.mostrar();

    }

}
