
package pilascolas;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
*
* @author PaulaAndreaRamirezMu
*/
public class Pilascolas {

    
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 5; i++) {
            qu.add(i);
        }
        System.out.println("El head de esta cola es: "+qu);
        System.out.println("");

        int head=qu.remove();
        System.out.println("El head de esta cola es: "+head);
        System.out.println("");
        System.out.println("Elemento de la cola del metodo");
        int size =qu.size();
        System.out.println("el nuevo tamaño de la cola es: "+size);
        System.out.println("El head de la cola ahora es: "+qu.peek());
        System.out.println("wlwmwntos d ela cola: "+qu);
                System.out.println("");
                System.out.println("");

                //pilas
         for (int i = 0; i < 5; i++) {
           st.add(i);
    }
   
    
       
        
         System.out.println("elementos de la pila "+st);
                System.out.println("");
                System.out.println("");
                //eliminar el head
                int head2 =st.pop();
                System.out.println("el head de la pila es "+head2);
                System.out.println("elementos de la fil despues del metodo pop");
                int size2 = st.size();
                System.out.println("Tamañp de la pila "+size2);
                System.out.println("el nuevo head es: "+st.peek());
                System.out.println("nuevos elemento "+st);
    }
}

