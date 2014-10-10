package com.algoritmosdeordenamiento;

import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;

public class RadixSort<E> {
    
    public static <E extends Comparable> void aplicarRadixArray( E[] a)
    {
        int i; 
        E m = a[0];
        int exp = 1;
        int n = a.length;
        int[] b = new int[10];
        
        for (  i = 1; i < n; i++ )
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];
 
            for ( i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for ( i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for ( i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for ( i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }
    
    public static <E extends Comparable> void sort( E[] array){
        int contadorFOR;
        int LargoMaxDato = 0;
        int exp = 1; 
        int nElementosEnArray = array.length;
        int[] b = new int[10];
        
        for (contadorFOR = 0; contadorFOR < nElementosEnArray; contadorFOR++){        
            if (array[contadorFOR].toString().length() > LargoMaxDato){
                LargoMaxDato = array[contadorFOR].toString().length();
            }
        }
        
        while (LargoMaxDato / exp > 0){
            
            E[] genericsArray = (E[])new Object[27];
            int[] bucket = new int[256];
            
            for (contadorFOR = 0; contadorFOR < nElementosEnArray; contadorFOR++)
                bucket[(array[contadorFOR] / exp) % 10]++;
            for (contadorFOR = 1; contadorFOR < 10; contadorFOR++)
                bucket[contadorFOR] += bucket[contadorFOR - 1];
            for (contadorFOR = nElementosEnArray - 1; contadorFOR >= 0; contadorFOR--)
                b[--bucket[(array[contadorFOR] / exp) % 10]] = array[contadorFOR];
            for (contadorFOR = 0; contadorFOR < nElementosEnArray; contadorFOR++)
                array[contadorFOR] = b[contadorFOR];
            exp *= 10;        
        }
    } 
    
    public static <E extends Comparable> void aplicarRadixLista( Lista<E> lista)
    {
        int i; 
        E m = lista.getHead().getDato();
        int exp = 1;
        int n = lista.getTalla();
        
        Lista<E> b = new Lista<>();
        
        for (Nodo<E> iterador = lista.getHead(); iterador != null; iterador = iterador.getSiguiente() )
            if (iterador > m)
                m = iterador.getDato();
        
        while (m / exp > 0)
        {
            Lista<E> bucket = new Lista<>();
 
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }

}