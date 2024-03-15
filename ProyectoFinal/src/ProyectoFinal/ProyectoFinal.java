package ProyectoFinal;

import java.io.*;
import static ProyectoFinal.Arreglos.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ProyectoFinal {
    
    public static void main(String[] args) {
        Array p = new Array();
        p.agregarEstudiantes(p.cont, p.estudiante, p.date, p.lista,p.op);
        p.imprimirLista(p.lista, p.numeral);
    }
    
}