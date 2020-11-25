import java.util.Scanner;
/**
 *
 * @author Dylan Tenorio Rojas C07802
 * @version 25/11/2020
 */
public class Main
{
    public static void main(String[] args)
    {
        Grupo grupo = new Grupo();
        int op = 1;
        Scanner scanInt = new Scanner(System.in);
        do{
            grupo.agregarEstudiante();
            System.out.println("Desea ingresar otro estudiante? \n 1) si \n 2) no");
            op = scanInt.nextInt();
        }while (op !=2);
        grupo.LlenarArbol();
        System.out.println("\f");
        do{
            System.out.println("\f");
            System.out.println("1) Ingresar un promedio y todos los que tengan un promedio mayor al ingresado");
            System.out.println("2) Ingresar un promedio y todos los que tengan un promedio menor al ingresado");
            System.out.println("3) Ingresar un promedio y todos los que tengan un promedio igual al ingresado");
            System.out.println("4) Mostrar todos los promedios");
            System.out.println("5) Salir");
            op = scanInt.nextInt();
            switch (op) {
                case 1: 
                    System.out.println("Ingrese el promedio");
                    Scanner scanFloat1 = new Scanner(System.in);
                    float promedio1 = scanFloat1.nextFloat();
                    grupo.MostrarMayor(promedio1);  
                break;
                
                case 2: 
                    System.out.println("Ingrese el promedio");
                    Scanner scanFloat2 = new Scanner(System.in);
                    float promedio2 = scanFloat2.nextFloat();
                    grupo.MostrarMenor(promedio2);  
                break;
                
                case 3: 
                    System.out.println("Ingrese el promedio");
                    Scanner scanFloat3 = new Scanner(System.in);
                    float promedio3 = scanFloat3.nextFloat();
                    grupo.MostrarIgual(promedio3);  
                break;
                
                case 4: 
                    grupo.MostrarTodo();    
                break;
            }
        Scanner wait = new Scanner(System.in);
        String waiter = wait.nextLine();
        }while (op !=5);
    }
}
