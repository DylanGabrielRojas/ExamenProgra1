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
    }
}
