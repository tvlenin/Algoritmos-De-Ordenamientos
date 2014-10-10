/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.de.ordenamientos;

import algoritmos.de.ordenamientos.Lista.Lista;
import algoritmos.de.ordenamientos.Lista.Nodo;
import java.util.Arrays;

/**
 *
 * @author tvlenin
 */
public class SelectionSort {
    
    
    public static <E> void intercambiar(E []a, int i, int j)
    {
	E aux = a[i];
	a[i] = a[j];
        a[j]= aux ;
    }
	
    public static <E extends Comparable> void SelectionArray(E a[])
    {
        System.out.println(Arrays.toString(a));
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
        System.out.println(Arrays.toString(a));
    }
    public static <E extends Comparable> void SelectionSortLista(Lista<E> lista){
        
       
    }
    
   
    
       
}
