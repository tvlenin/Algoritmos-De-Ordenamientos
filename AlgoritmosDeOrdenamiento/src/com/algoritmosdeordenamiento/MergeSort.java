package com.algoritmosdeordenamiento;

import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;
import java.lang.reflect.Array;

public class MergeSort {
     
    public static <E extends Comparable> void mergeSortArray( E[] a){
        E[] merged = (E[]) Array.newInstance(a.getClass().getComponentType(), a.length);
        
        mergeSortArrayAux( a, merged, 0, a.length - 1 );
    }
    private static <E extends Comparable> void mergeSortArrayAux( E[] a, E[] tmpArray,int left, int right ){
        if( left < right ){
            int center = ( left + right ) / 2;
            mergeSortArrayAux( a, tmpArray, left, center );
            mergeSortArrayAux( a, tmpArray, center + 1, right );
            mergeArray( a, tmpArray, left, center + 1, right );
        }
    }

    private static<E extends Comparable>  void mergeArray( E[] a,E[] tmpArray,int leftPos, int rightPos, int rightEnd){
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd ){
            if( a[ leftPos ].compareTo(a[rightPos]) < 0 ){
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            }
            else{
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];
            }
        }
        while( leftPos <= leftEnd ){    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];
        }
        while( rightPos <= rightEnd ){  // Copy rest of right half
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];
        }
        // Copy TmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- ){
            a[ rightEnd ] = tmpArray[ rightEnd ];
        }
    }
    
    //--------------------------------Para Lista--------------------------------------------------------------// 

    public static <E extends Comparable> Nodo<E> MergeSortLista(Nodo<E> headOriginal){
        if (headOriginal == null || headOriginal.getSiguiente() == null)
            return headOriginal;
        Nodo<E> a = headOriginal;
        Nodo<E> b = headOriginal.getSiguiente();
        while ((b != null) && (b.getSiguiente() != null)){
            headOriginal = headOriginal.getSiguiente();
            b = (b.getSiguiente()).getSiguiente();
        }
        b = headOriginal.getSiguiente();
        headOriginal.siguiente = null;
        return merge(MergeSortLista(a), MergeSortLista(b));
    }
 
    private static <E extends Comparable> Nodo<E> merge(Nodo<E> a, Nodo<E> b){
        Nodo temp = new Nodo<>(100);
        Nodo head = temp;
        Nodo c = head;
        while ((a != null) && (b != null)){
            if (a.getDato().compareTo(b.getDato()) <= 0){
                c.siguiente = a;
                c = a;
                a = a.getSiguiente();
            }
            else{
                c.siguiente = b;
                c = b;
                b = b.getSiguiente();
            }
        }
        c.siguiente = (a == null) ? b : a;
        return head.siguiente;
    }

    
  
}//class MergeSortLista


