import java.util.Scanner;
/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class Grupo
{
    ListaEstudiantes lista = new ListaEstudiantes();
    Arbol arbol = new Arbol();
    /**
     * Constructor for objects of class Estudiantes
     */
    public Grupo()
    {
    }

    /**
     * ingresa los datos del estudiante y muestra la lista actual de estudiantes
     */
    public void agregarEstudianteLista(String nombre, int carnet, int[] Notas)
    {
        lista.agregar(nombre, carnet, Notas);
        toStringLista();
    }

    /**
     * recopila los datos de los estudiantes y los ingresa
     */
    public void agregarEstudiante()
    {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = scanString.nextLine();
        System.out.println("Ingrese el carnet del estudiante");
        int carnet = scanInt.nextInt();
        System.out.println("Ingrese la cantidad de notas a ingresar para el estudiante");
        int tamanioNotas = scanInt.nextInt();
        int[] Notas = new int[tamanioNotas];
        for(int i=0; i < tamanioNotas; i++){
            System.out.println("Ingrese la nota");
            Notas[i] = scanInt.nextInt();
        }
        agregarEstudianteLista(nombre, carnet, Notas);
    }
    
    
    /**
     * 
     */
    public void toStringLista(){
        System.out.println(lista.toString());   
    }
    
    /**
     * 
     */
    public void LlenarArbol(){
        arbol.agregar(lista);
    }
    
    
    /**
     * 
     */
    public void MostrarTodo(){
        System.out.println(arbol.toString());
    }
    
    
    /**
     * 
     */
    public void MostrarMayor(float promedio){
        System.out.println(arbol.toStringMayor(promedio));
    }
    
    
    /**
     * 
     */
    public void MostrarMenor(float promedio){
        System.out.println(arbol.toStringMenor(promedio));
    }
    
    
    /**
     * 
     */
    public void MostrarIgual(float promedio){
        System.out.println(arbol.toStringIgual(promedio));
    }
}
