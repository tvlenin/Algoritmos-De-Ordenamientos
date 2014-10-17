package com.algoritmosdeordenamiento;

import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;

public class QuickSort {

    public static <E extends Comparable> void doQuickSortArray(E[] a) {
        if (a == null) {
            throw new 
                IllegalArgumentException("Input Array cannot be null");
        }
        int length = a.length;
        if (length == 1) return;
        doQuickSortArray(a, 0, length-1);
    }
    
    private static <E extends Comparable> void doQuickSortArray(E[] a, int left, int right) {
        if (left >= right) return;
        
        //Choose the pivot using median of 3 partitioning
        //using the following 2 steps
        //First step: find the center
        int center = (left+right)/2;
        //Second step: sort left, center and right
        if (a[left].compareTo(a[center]) > 0) {
            swap(a, left, center);
        }
        if (a[left].compareTo(a[right]) > 0) {
            swap(a, left, right);
        }
        if (a[center].compareTo(a[right]) > 0) {
            swap(a, center, right);
        }    
        //Third Step: 
        //Got the pivot and it is at the center. 
        //Move it to the end of the array.
        swap(a,center,right-1);
        int pivot = right-1;
        
        //Partition the array 
        int i = left;
        int j = right - 2;
        if (j >= 0) {
            for(;;) {
                while (a[i].compareTo(a[pivot])< 0) {
                i++;
                }
                while(a[j].compareTo(a[pivot]) > 0) {
                j--;
                }
                if (i >= j) break;
                swap(a,i,j);
            }
        }
        //Put the pivot at ith position of the array
        swap(a,i,right-1); 
        //Now all the elements to the right of i are less than 
        //it and all the elements to the left of i are greater
        //than it. So partition the array and 
        //recursively call quicksort on the left and right partition
        doQuickSortArray(a, left, i-1);
        doQuickSortArray(a, i+1, right);
        
    }
    
    /**
     * Internal method to swap to elements in an array.
     * @param a an array of objects.
     * @param left the index of the first object.
     * @param right the index of the second object.
     */
    private static <T extends Comparable> void swap(T[] a, int left, int right) {
        T temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    
    
    public static <E extends Comparable> void doQuickSortLista(Lista<E> a) {
        if (a == null) {
            throw new 
                IllegalArgumentException("Input Lista cannot be null");
        }
        int length = a.getTalla();
        if (length == 1) return;
        Nodo<E> izq = a.getHead();
        Nodo<E> der = a.getTail();
        doQuickSortLista(a, izq, der);
    }
    
    private static <E extends Comparable> void doQuickSortLista(Lista<E> a, Nodo<E> left, Nodo<E> right) {
       
        if (left.getDato().compareTo(right.getDato()) > 0) return;
        
        //Choose the pivot using median of 3 partitioning
        //using the following 2 steps
        //First step: find the center
        Nodo<E> center = a.getCentro(left,right);
        
        if (left.getDato().compareTo(center.getDato()) > 0) {
            a.intercambiarNodos(left, right);
        }
        if (left.getDato().compareTo(right.getDato()) > 0) {
            a.intercambiarNodos(left, right);
        }
        if (center.getDato().compareTo(right.getDato()) > 0) {
            a.intercambiarNodos(center, right);
        }    
        System.out.println(center.getDato()+"esteeeee");
        System.out.println(right.getPrevio().getDato());
        a.intercambiarNodos(center, right.getPrevio());

        Nodo<E> pivot = right.getPrevio();
        
        //Partition the array 
        Nodo<E> i = left;
        Nodo<E> j = right.getPrevio().getPrevio();
        if (j != null) {
            for(;;) {
                while (i.getDato().compareTo(pivot.getDato()) < 0) {
                    i = i.getSiguiente();
                }
                while(j.getDato().compareTo(pivot.getDato()) > 0) {
                    j= j.getPrevio();
                }
                if (i.getDato().compareTo(j.getDato()) >= 0) break;
                a.intercambiarNodos(i, j);
            }
        }
        //Put the pivot at ith position of the array
        a.intercambiarNodos(i, right.getPrevio());
        //Now all the elements to the right of i are less than 
        //it and all the elements to the left of i are greater
        //than it. So partition the array and 
        //recursively call quicksort on the left and right partition
        doQuickSortLista(a, left, i.getPrevio());
        doQuickSortLista(a, i.getSiguiente(), right);
        
    }

}

