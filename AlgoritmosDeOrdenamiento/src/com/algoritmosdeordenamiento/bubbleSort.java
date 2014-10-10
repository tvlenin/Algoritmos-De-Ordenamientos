package com.algoritmosdeordenamiento;

import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;

public class bubbleSort {
    
    public static <E extends Comparable> void aplicarBubbleSortLista(Lista<E> lista){
        boolean flag = true;   // set flag to true to begin first pass
        while ( flag ){
            flag = false;    //set flag to false awaiting a possible swap
            for( Nodo<E> iterador = lista.getHead();  iterador.getSiguiente() != null;  iterador = iterador.getSiguiente() ){
                if ( iterador.getDato().compareTo(iterador.getSiguiente().getDato()) > 0 ){   // change to > for ascending sort
                    lista.intercambiarNodos(iterador, iterador.getSiguiente());
                    flag = true;
                }
            }
        }
    }
    
    public static <E extends Comparable> void aplicarBubbleSortArray(E[] array){
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        E temp;   //holding variable
        while ( flag ){
            flag = false;    //set flag to false awaiting a possible swap
            for( j=0;  j < array.length - 1 ;  j++ ){
                if ( array[ j ].compareTo(array[j+1]) > 0 ){   // change to > for ascending sort
                    temp = array[ j ];                //swap elements
                    array[ j ] = array[ j+1];
                    array[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred  
                }
            }
        }
    }
    
}
