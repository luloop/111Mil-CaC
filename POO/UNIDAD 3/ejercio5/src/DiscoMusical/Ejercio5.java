
package DiscoMusical;


public class Ejercio5
{

    public static void main(String[] args)
    {
        DiscoMusical nuevoDisco = new DiscoMusical("lolo");
        System.out.println(nuevoDisco.getTitulo());
        System.out.println(nuevoDisco.getAutor());
        System.out.println(nuevoDisco.getFormato());
        System.out.println(nuevoDisco.isDigital());
        System.out.println(nuevoDisco.getAnio());
        

    }
}