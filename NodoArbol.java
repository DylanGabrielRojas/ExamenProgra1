
/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class NodoArbol
{
    // instance variables - replace the example below with your own
    private NodoEstudiante estudiante;
    private NodoArbol derecho;
    private NodoArbol izquierdo;

    /**
     * Constructor for objects of class Nodo
     */
    public NodoArbol(NodoEstudiante NodoEstudiante)
    {
        this.estudiante = NodoEstudiante;
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
    public String getNombre(){
        return estudiante.getNombre();
    }
    
    
    /**
     * 
     */
    public String toString(){
        return estudiante.toString();
    }
    
    /**
     * 
     */
    public NodoArbol getDerecho(){
        return derecho;
    }
    
    /**
     * 
     */
    public void setDerecho(NodoArbol derechoParam){
        this.derecho = derechoParam;
    }
    
    /**
     * 
     */
    public NodoArbol getIzquierdo(){
        return izquierdo;
    }
    
    /**
     * 
     */
    public void setIzquierdo(NodoArbol izquierdoParam){
        this.izquierdo = izquierdoParam;
    }
    
}