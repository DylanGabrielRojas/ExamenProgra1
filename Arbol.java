
/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class Arbol
{
    // instance variables - replace the example below with your own
    private NodoArbol inicio;

    public Arbol()
    {
        inicio = null;
    }
    
    public void agregar(ListaEstudiantes Lista){
        NodoEstudiante[] VectorLista = Lista.PasarArbol();
        for (int i = 0; i <VectorLista.length; i++){
        NodoArbol Nodo = new NodoArbol(VectorLista[i]);
            if (inicio == null){
                inicio = Nodo;
            } else {
                NodoArbol auxiliar = inicio;
                AgregarNodo(Nodo, auxiliar);
            }
        }
        
    }
    
    /**
     * 
     */
    public void AgregarNodo(NodoArbol Nodo, NodoArbol auxiliar){
        if (auxiliar.getPromedio() >= Nodo.getPromedio()){
            if (auxiliar.getIzquierdo() != null){
                AgregarNodo(Nodo, auxiliar.getIzquierdo());
            }
            else {
                auxiliar.setIzquierdo(Nodo);
            }
        } else{
            if (auxiliar.getDerecho() != null){
                AgregarNodo(Nodo, auxiliar.getDerecho());
            }
            else {
                auxiliar.setDerecho(Nodo);
            }
        }
    }
    
    public String toString() {
        NodoArbol auxiliar = inicio;
        String arbolString = auxiliar.getPromedio() + " ";
        if (auxiliar.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodo(auxiliar.getIzquierdo());
        }
        if (auxiliar.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodo(auxiliar.getDerecho());
        }
        return arbolString;
    }
    
    public String ImprimeNodo(NodoArbol Nodo) {
        String arbolString = Nodo.getPromedio() + " ";
        if (Nodo.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodo(Nodo.getIzquierdo());
        }
        if (Nodo.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodo(Nodo.getDerecho());
        }
        return arbolString;
    }
}