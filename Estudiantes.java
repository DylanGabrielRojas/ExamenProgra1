/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class Estudiantes
{
    private String nombre;
    private int carnet;
    private ListaNotas Notas = new ListaNotas();
    private float promedio;

    /**
     * Constructor for objects of class Estudiantes
     */
    public Estudiantes(String nombreParam, int carnetParam)
    {
        this.nombre = nombreParam;
        this.carnet = carnetParam;
    }

    /**
     * 
     */
    public void AgregarNota(int Nota)
    {
        Notas.agregar(Nota);
        CalcularPromedio();
    }

    /**
     * 
     */
    public void CalcularPromedio()
    {
        this.promedio = Notas.CalcularPromedio(Notas.getInicio());
    }

    /**
     * 
     */
    public String toString()
    {
        return (carnet + " " + nombre + " " + promedio);
    }

    /**
     * 
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * 
     */
    public int getCarnet(){
        return this.carnet;
    }

    /**
     * 
     */
    public Float getPromedio(){
        System.out.println(this.promedio);
        return this.promedio;
    }
}
