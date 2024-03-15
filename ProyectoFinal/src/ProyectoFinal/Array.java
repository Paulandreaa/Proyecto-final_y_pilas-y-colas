package ProyectoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    int cont = 1, op, numeral = 1, n;
    String estudiante;
    Scanner date = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<>();

    public static void agregarEstudiantes(int cont, String estudiante, Scanner date, ArrayList<String> lista, int op) {
        while (op != 1) {
            System.out.println("Ingrese estudiante numero:" + (cont));
            estudiante = date.next();
            lista.add(estudiante);
            cont++;
            System.out.println("¿Desea agregar otro estudiante?");
            System.out.println("1. No");
            System.out.println("2. Si");
            op = date.nextInt();
        }

    }

    public static int imprimirLista(ArrayList<String> lista, int numeral) {

        if (!lista.isEmpty()) {
            System.out.println("Lista Estudiantes");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(numeral + ") " + lista.get(i));
                numeral++;
            }
        } else {
            System.out.println("Lista vacia");
        }
        return numeral;
    }

    public static void agregarEstudiante() {
        String nuevoEstudiante;

    }
}
