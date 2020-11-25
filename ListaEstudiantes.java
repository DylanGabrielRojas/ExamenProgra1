
/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class ListaEstudiantes
{
    private NodoNota inicio;
    private int tamanio;

    public void ListaEstudiantes()
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