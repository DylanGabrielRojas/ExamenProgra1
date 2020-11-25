
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

    
/**
 * crea e  ingresa los nodos a la lista de estudiante del grupo
 */
public void agregar(String nombre, int carnet, int[] Notas)
{
    NodoEstudiante nuevoNodo = new NodoEstudiante(nombre, carnet);
    for(int i=0; i <Notas.length; i++){
        nuevoNodo.AgregarNota(Notas[i]);
    }
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
        } else {
            if (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
                agregarAlfabeticamente(nuevoNodo, auxiliar, auxiliarAnterior);
            } else {
                auxiliar.setSiguiente(nuevoNodo);
            }
        }
    }
    this.tamanio = tamanio + 1;
}
    
    
/**
 * este metodo se encarga de que los nodos se ingresen en orden alfabetico
 */
public void agregarAlfabeticamente(NodoEstudiante Nuevo, NodoEstudiante auxiliar, NodoEstudiante auxiliarAnterior) {
    if (auxiliar.getSiguiente() != null){
        if(Nuevo.getNombre().compareToIgnoreCase(auxiliar.getNombre()) < 0){
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
 * metodo toString de los estudiantes, los acomoda en lista
 */
public String toString(){
    NodoEstudiante auxiliar = inicio;
    String lista ="";
    while(auxiliar.getSiguiente() != null){
        lista = lista + auxiliar.toString() + "\n";
        auxiliar = auxiliar.getSiguiente();
    }
    lista = lista + auxiliar.toString();
    return lista;
}

/**
 * pasa un vector con los nodos al arbol para que los acomode
 */
public NodoEstudiante[] PasarArbol(){
    NodoEstudiante auxiliar = inicio;
    NodoEstudiante[] VectorLista = new NodoEstudiante[tamanio];
    int contador = 0;
    while (auxiliar.getSiguiente() != null){
        VectorLista[contador] = auxiliar;
        contador++;
        auxiliar = auxiliar.getSiguiente();
    }
    VectorLista[contador] = auxiliar;
    return VectorLista;
}
}