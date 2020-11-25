
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Grupo grupo = new Grupo();
        String nombre = "uwu";
        int carnet = 42069;
        grupo.agregarEstudiante(nombre, carnet);
        grupo.toStringLista();
    }
}
