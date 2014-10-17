import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;
import com.algoritmosdeordenamiento.InsertionSort;
import com.algoritmosdeordenamiento.MergeSort;
import com.algoritmosdeordenamiento.QuickSort;
import com.algoritmosdeordenamiento.RadixSort;
import com.algoritmosdeordenamiento.SelectionSort;
import com.algoritmosdeordenamiento.bubbleSort;
import com.sun.scenario.effect.Merge;
import java.lang.*;
import java.util.Random;


public class main {
   
    public static void main(String[] args) {
        
        String[] a = new String[3];
        a[0]="a";
        a[1]="zzc";
        a[2]="b";

        Integer[] b = new Integer[3];
        b[0] =3;
        b[1] =2;
        b[2] =1;
        
        Lista<Integer> c = new Lista<>();
        c.insertar(1);
        c.insertar(1);
        c.insertar(3);
        
        Lista<String> d = new Lista<>();

        d.insertar("ay");
        d.insertar("a");
        d.insertar("z");
        
        
        RadixSort.aplicarLista(c);
        RadixSort.aplicarArray(b);
//   for(int i = 0; i< c.length; i++){
     //      System.out.println(c[i]);
     //   }
        
    //    System.out.println(c.getHead().getDato());
     //   System.out.println(c.getHead().getSiguiente().getDato());
      //  System.out.println(c.getHead().getSiguiente().getSiguiente().getDato());
            
    }
}
