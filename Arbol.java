
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
    
    
    /**
     * primera parte para ingresar los nodos a la lista, pasa a la funcion recursiva los nodos
     * para que los acomode
     */
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
     * funcion recursiva de insersion de los nodos, acomoda el nodo segun sea mayor o no del auxiliar,
     * va recorriendo el arbol hasta llegar a las hojas
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
    
    
    /**
     * imprime el arbol, no tiene un orden especifico
     */
    public String toString() {
        NodoArbol auxiliar = inicio;
        String arbolString =auxiliar.toString() + "\n";
        if (auxiliar.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodo(auxiliar.getIzquierdo());
        }
        if (auxiliar.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodo(auxiliar.getDerecho());
        }
        return arbolString;
    }
    
    /**
     * funcion recurisva para imprimir el arbol
     */
    public String ImprimeNodo(NodoArbol Nodo) {
        String arbolString =Nodo.toString() + "\n";
        if (Nodo.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodo(Nodo.getIzquierdo());
        }
        if (Nodo.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodo(Nodo.getDerecho());
        }
        return arbolString;
    }
    
    
    /**
     * imprime los valores mayores al promedio ingresado del arbol
     */
    public String toStringMayor(float promedio) {
        NodoArbol auxiliar = inicio;
        String arbolString = "";
        if (auxiliar.getPromedio() > promedio) {
            arbolString = auxiliar.toString() + "\n";
        }
        if (auxiliar.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodoMayor(auxiliar.getIzquierdo(), promedio);
        }
        if (auxiliar.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodoMayor(auxiliar.getDerecho(), promedio);
        }
        if (arbolString == ""){
        arbolString ="No hay concidencias";
        }
        return arbolString;
    }
    
    /**
     * imprime los valores mayores al promedio ingresado del arbol, de manera recursiva
     */
    public String ImprimeNodoMayor(NodoArbol Nodo, float promedio) {
        String arbolString = "";
        if (Nodo.getPromedio() > promedio) {
            arbolString = Nodo.toString() + "\n";
        }
        if (Nodo.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodoMayor(Nodo.getIzquierdo(), promedio);
        }
        if (Nodo.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodoMayor(Nodo.getDerecho(), promedio);
        }
        return arbolString;
    }
    
    
    /**
     * imprime los valores menores al promedio ingresado del arbol 
     */
    public String toStringMenor(float promedio) {
        NodoArbol auxiliar = inicio;
        String arbolString = "";
        if (auxiliar.getPromedio() < promedio) {
            arbolString = auxiliar.toString() + "\n";
        }
        if (auxiliar.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodoMenor(auxiliar.getIzquierdo(), promedio);
        }
        if (auxiliar.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodoMenor(auxiliar.getDerecho(), promedio);
        }
        if (arbolString == ""){
        arbolString ="No hay concidencias";
        }
        return arbolString;
    }
    
    /**
     * imprime los valores menores al promedio ingresado del arbol, de manera recursiva
     */
    public String ImprimeNodoMenor(NodoArbol Nodo, float promedio) {
        String arbolString = "";
        if (Nodo.getPromedio() < promedio) {
            arbolString = Nodo.toString() + "\n";
        }
        if (Nodo.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodoMenor(Nodo.getIzquierdo(), promedio);
        }
        if (Nodo.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodoMenor(Nodo.getDerecho(), promedio);
        }
        return arbolString;
    }
    
    
    /**
     * imprime los valores iguales al promedio ingresado del arbol
     */
    public String toStringIgual(float promedio) {
        NodoArbol auxiliar = inicio;
        String arbolString = "";
        if (auxiliar.getPromedio() == promedio) {
            arbolString = auxiliar.toString() + "\n";
        }
        if (auxiliar.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodoIgual(auxiliar.getIzquierdo(), promedio);
        }
        if (auxiliar.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodoIgual(auxiliar.getDerecho(), promedio);
        }
        if (arbolString == ""){
        arbolString ="No hay concidencias";
        }
        return arbolString;
    }
    
      
    /**
     * imprime los valores iguales al promedio ingresado del arbol, de manera recursiva
     */
    public String ImprimeNodoIgual(NodoArbol Nodo, float promedio) {
        String arbolString = "";
        if (Nodo.getPromedio() == promedio) {
            arbolString = Nodo.toString() + "\n";
        }
        if (Nodo.getIzquierdo() != null){
            arbolString = arbolString + ImprimeNodoIgual(Nodo.getIzquierdo(), promedio);
        }
        if (Nodo.getDerecho() != null) {
            arbolString = arbolString + ImprimeNodoIgual(Nodo.getDerecho(), promedio);
        }
        return arbolString;
    }
    
}