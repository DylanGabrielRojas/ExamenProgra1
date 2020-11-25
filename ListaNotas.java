
/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class ListaNotas
{
    // instance variables - replace the example below with your own
    private NodoNota inicio;
    private int tamanio;

    public ListaNotas()
    {
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia()
    {
        return inicio == null;
    }
    
    public int getTamanio()
    {
        return tamanio;
    }
    
    public NodoNota getInicio()
    {
        return inicio;
    }
    
    /**
     * Ingresa un Nodo a la lista
     */
    public void agregar(int Nota)
    {
        NodoNota nuevoNodo = new NodoNota();
        nuevoNodo.setNota(Nota);
        
        if(esVacia())
        {
            inicio = nuevoNodo;
        }
        else
        {
            NodoNota auxiliar = inicio;
            
            while(auxiliar.getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }
            
            auxiliar.setSiguiente(nuevoNodo);
        }
        
        tamanio++;
    }
    
    
    /**
     * Calcula el Promedio del estudiante una vez que se terminan de ingresar las notas, esto de acuerdo
     * al tamanio de la lista denotas y las notas, es un metodo recursivo que va sumando los valores de la nota
     * sobre el tamanio de la lista para sacar el promedio
     */
    public float CalcularPromedio(NodoNota auxiliar){
        float promedio = 0f;
        if (auxiliar.getSiguiente() != null){
            promedio = (float)auxiliar.getNota()/tamanio + CalcularPromedio(auxiliar.getSiguiente());
        }
            else {
                promedio = (float)auxiliar.getNota()/tamanio;
            }
        return promedio;
    }
}
