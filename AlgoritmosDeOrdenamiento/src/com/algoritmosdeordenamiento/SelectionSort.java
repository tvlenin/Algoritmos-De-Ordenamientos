
package com.algoritmosdeordenamiento;

import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;

public class SelectionSort {
    
    
    public static <E> void intercambiar(E []a, int i, int j)
    {
	E aux = a[i];
	a[i] = a[j];
        a[j]= aux ;
    }
	
    public static <E extends Comparable> void SelectionArray(E a[]){
        int indiceMenor, i, j, n;
        n = a.length;
        for (i = 0; i < n-1; i++)
        {
            indiceMenor = i;
            for ( j= i+1;j < n;j++)               
                if (a[j].compareTo(a[indiceMenor]) < 0)
                    indiceMenor =j;
                if (i != indiceMenor)
                    intercambiar(a, i, indiceMenor);
        }
    }
    
    public static <E extends Comparable> void SelectionSortLista(Lista<E> lista){   
        int n = lista.getTalla();
        Nodo<E> j;
        Nodo<E> iterador;
        Nodo<E> indiceMenor;
        
        for (iterador = lista.getHead(); iterador != null; iterador=iterador.getSiguiente()){
            
            indiceMenor = iterador;
            for ( j = iterador.getSiguiente(); j != null; j = j.getSiguiente())               
                if (j.getDato().compareTo(indiceMenor.getDato()) < 0)
                    indiceMenor =j;
                if (iterador.getDato() != indiceMenor.getDato())
                    lista.intercambiarNodos(iterador, indiceMenor);
        }
    }
}