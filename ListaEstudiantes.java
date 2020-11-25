
/**
*
* @author Dylan Tenorio Rojas C07802
* @version 25/11/2020
*/
public class ListaEstudiantes
{
private NodoEstudiante inicio;
private int tamanio;

public ListaEstudiantes()
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

public NodoEstudiante getInicio()
{
    return inicio;
}

public void agregar(String nombre, int carnet)
{
    NodoEstudiante nuevoNodo = new NodoEstudiante(nombre, carnet);
    if(esVacia())
    {
        inicio = nuevoNodo;
    }
    else
    {
        NodoEstudiante auxiliar = inicio, auxiliarAnterior = auxiliar;
        if(nuevoNodo.getNombre().compareToIgnoreCase(auxiliar.getNombre()) < 0){
            inicio = nuevoNodo;
            nuevoNodo.setSiguiente(auxiliar);
            auxiliar.setSiguiente(null);
        } else {
            if (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
                agregarAlfabeticamente(nuevoNodo, auxiliar, auxiliarAnterior);
            } else {
                auxiliar.setSiguiente(nuevoNodo);
            }
        }
    }
tamanio++;
}
    
public void agregarAlfabeticamente(NodoEstudiante Nuevo, NodoEstudiante auxiliar, NodoEstudiante auxiliarAnterior) {
    if (auxiliar.getSiguiente() != null){
            System.out.println("FUCK");
        if(Nuevo.getNombre().compareToIgnoreCase(auxiliar.getNombre()) < 0){
            System.out.println("FUCK");
            auxiliarAnterior.setSiguiente(Nuevo);
            Nuevo.setSiguiente(auxiliar);
        } else {
        agregarAlfabeticamente(Nuevo, auxiliar.getSiguiente(), auxiliar);
        }
    } else if (Nuevo.getNombre().compareToIgnoreCase(auxiliar.getNombre()) >= 0) {
        auxiliar.setSiguiente(Nuevo);
    } else {
            auxiliarAnterior.setSiguiente(Nuevo);
            Nuevo.setSiguiente(auxiliar);
    }
}

/**
 * 
 */
public String toString(){
    NodoEstudiante auxiliar = inicio;
    String lista ="";
    while(auxiliar.getSiguiente() != null){
        lista = lista + auxiliar.toString();
    }
    lista = lista + auxiliar.toString();
    return lista;
}
}