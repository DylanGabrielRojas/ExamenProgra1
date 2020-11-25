/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class Grupo
{
    ListaEstudiantes lista = new ListaEstudiantes();
    /**
     * Constructor for objects of class Estudiantes
     */
    public Grupo()
    {
    }

    /**
     * 
     */
    public void agregarEstudiante(String nombre, int carnet)
    {
        lista.agregar(nombre, carnet);
    }
    
    public void toStringLista(){
    System.out.println(lista.toString());}
}
