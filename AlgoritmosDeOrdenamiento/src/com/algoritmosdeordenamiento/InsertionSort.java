package com.algoritmosdeordenamiento;

import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;

public class InsertionSort {
    
    public static <E extends Comparable> void insertionLista(Lista<E> lista) {
        for (Nodo<E> iterador = lista.getHead(); iterador != null; iterador = iterador.getSiguiente()){
            E valueToSort = iterador.getDato();
            Nodo<E> j = iterador;
            
            while (j.getPrevio() != null && (j.getPrevio().getDato().compareTo(valueToSort) > 0) ) {
                j.setData(j.getPrevio().getDato());
                j = j.getPrevio();
            }
            j.setData(valueToSort);
        }
    }
    
    public static <E extends Comparable> void InsertionArray(E a[]){
        for (int i = 1; i < a.length; i++) {
            E valueToSort = a[i];
            int j = i;
            while (j > 0 && a[j - 1].compareTo(valueToSort) > 0) {   
                a[j] = a[j - 1];
                j--;
            }
            a[j] = valueToSort;
        }
    }
    
}
