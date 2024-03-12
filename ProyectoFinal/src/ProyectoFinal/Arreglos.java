package ProyectoFinal;
import java.util.Scanner;


public class Arreglos {
    int x;
    Double notas[] = new Double[x];
    Scanner data = new Scanner(System.in);
    
    private static int Ctd_estudiantes(int x, Scanner data){
        System.out.println("Ingrese la cantidad de notas");
        x = data.nextInt();
        return x;
        
    }
    private static void Llenar_estudiantes(String estudiante, Scanner data,Double notas[]){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese nota del estudiante numero: "+(i+1));
            estudiante = data.next();
        }
     }
    private static void Impirmir(Double notas[]){
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
    
}
