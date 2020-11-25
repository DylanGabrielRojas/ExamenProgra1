
/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class NodoNota
{
    // instance variables - replace the example below with your own
    private int nota;
    private NodoNota siguiente;

    /**
     * Constructor for objects of class Nodo
     */
    public NodoNota()
    {
        this.nota = 0;
        this.siguiente = null;
    }
    
    public int getNota()
    {
        return nota;
    }
    
    public void setNota(int Nota)
    {
        this.nota = Nota;
    }

    public NodoNota getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(NodoNota siguiente)
    {
        this.siguiente = siguiente;
    }
}
