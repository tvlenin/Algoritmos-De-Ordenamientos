import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;
import com.algoritmosdeordenamiento.RadixSort;
import com.algoritmosdeordenamiento.bubbleSort;
import java.util.Random;
import java.lang.*;


public class main {
   
    public static void main(String[] args) {
        
        String[] a = new String[3];
        a[0]="a";
        a[1]="c";
        a[2]="b";

        Integer[] b = new Integer[3];
        b[0] =103;
        b[1] =32;
        b[2] =12;
        
        Lista<Integer> c = new Lista<>();
        c.insertar(1);
        c.insertar(101);
        c.insertar(3);
        
        Lista<String> d = new Lista<>();
        d.insertar("c");
        d.insertar("b");
        d.insertar("a");
        
        
        
        d.intercambiarNodos(d.getHead(), d.getHead().getSiguiente());
       // d.intercambiarNodos(d.getHead(), d.getHead().getSiguiente().getSiguiente());
        
        //d.intercambiarNodos(d.getHead().getSiguiente(), d.getHead());
        //d.intercambiarNodos(d.getHead().getSiguiente(), d.getHead().getSiguiente().getSiguiente());
        
        //  d.intercambiarNodos(d.getHead().getSiguiente().getSiguiente(), d.getHead());
        //d.intercambiarNodos(d.getHead().getSiguiente().getSiguiente(), d.getHead().getSiguiente());
        
        System.out.println(d.getHead().getDato()+" | "+ d.getHead().getSiguiente().getDato() +" | "+d.getHead().getSiguiente().getSiguiente().getDato());
        System.out.println(d.getTail().getPrevio().getPrevio().getDato()+" | "+d.getTail().getPrevio().getDato()+" | "+ d.getTail().getDato());
        System.out.println("cabeza: "+d.getHead().getDato()+" - cola:"+d.getTail().getDato());
        
        //bubbleSort.aplicarBubbleSortLista(d);
        /*
        System.out.println(d.getHead().getDato());
        System.out.println(d.getHead().getSiguiente().getDato());
        System.out.println(d.getHead().getSiguiente().getSiguiente().getDato());
*/
    }
}
