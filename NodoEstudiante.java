
/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class NodoEstudiante
{
    // instance variables - replace the example below with your own
    private Estudiante estudiante;
    private NodoEstudiante siguiente;

    /**
     * Constructor for objects of class Nodo
     */
    public NodoEstudiante(String Nombre, int Carnet)
    {
        this.estudiante = new Estudiante(Nombre, Carnet);
        this.siguiente = null;
    }
    
    
    /**
     * 
     */
    public void AgregarNota(int Nota)
    {
        this.estudiante.AgregarNota(Nota);
    }
    
    
    /**
     * 
     */
    public Estudiante getEstudiante()
    {
        return estudiante;
    }
    
    
    /**
     * 
     */
    public void setEstudiante(Estudiante Estudiante)
    {
        this.estudiante = Estudiante;
    }

    
    /**
     * 
     */
    public NodoEstudiante getSiguiente()
    {
        return siguiente;
    }
    
    
    /**
     * 
     */
    public String getNombre(){
        return estudiante.getNombre();
    }
    
    
    /**
     * 
     */
    public float getPromedio(){
        return estudiante.getPromedio();
    }
    
    
    /**
     * 
     */
    public void setSiguiente(NodoEstudiante siguiente)
    {
        this.siguiente = siguiente;
    }
    
    
    /**
     * 
     */
    public String toString(){
        return estudiante.toString();
    }
}
