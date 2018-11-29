package unidad3;

public class UNIDAD3
{

    public static void main(String[] args)
    {

        Empleado nuevoEmpleado = new Empleado(recursos.randoms.Nombre(), recursos.randoms.Apellido(), recursos.randoms.Entero(18, 45), recursos.randoms.VerdaderoFalso(), 10000);
        Empleado nuevoEmpleado2 = new Empleado(recursos.randoms.Nombre(), recursos.randoms.Apellido(), recursos.randoms.Entero(18, 45), recursos.randoms.VerdaderoFalso(), 20000);
        Empleado nuevoEmpleado3 = new Empleado(recursos.randoms.Nombre(), recursos.randoms.Apellido(), recursos.randoms.Entero(18, 45), recursos.randoms.VerdaderoFalso(), 50000);

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

        System.out.println("Aumento de Salario");
        nuevoEmpleado.aumeentarSalario(20);

        nuevoEmpleado.mostrar();

    }

}
