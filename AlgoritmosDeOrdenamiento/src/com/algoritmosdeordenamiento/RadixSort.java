package com.algoritmosdeordenamiento;

import com.algoritmosdeordenamiento.EstructurasDeDatos.Lista;
import com.algoritmosdeordenamiento.EstructurasDeDatos.Nodo;

public class RadixSort<E> {
    
    public static void aplicarArray( Integer[] a){
        int i = a[0]; 
        int m = a[0]; 
        int exp = 1;
        int n = a.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0){
            System.out.println(exp);
            int[] bucket = new int[10];
 
            for (i = 0; i < n; i++){
                System.out.println("1 ");
                bucket[(a[i] / exp) % 10]++;}
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }
    
    public static void aplicarLista( Lista<Integer> a){
        Nodo<Integer> i;
        int m = a.getHead().getDato();
        int exp = 1; 
        int n = a.getTalla();
        int[] b = new int[10];
        
        for (i = a.getHead(); i != null; i = i.getSiguiente())
            if (i.getDato() > m)
                m = i.getDato();
        
        while (m / exp > 0){
            int[] bucket = new int[10];
            for (i = a.getHead(); i != null; i = i.getSiguiente()){
                bucket[(i.getDato() / exp) % 10]++;
                
            for (int z = 1; z< 10; z++)
                bucket[z] += bucket[z - 1];
            for (i = a.getTail(); i != null ; i =i.getPrevio())
                b[--bucket[(i.getDato() / exp) % 10]] = i.getDato();
            int z = 0;
            for (i = a.getHead(); i != null; i = i.getSiguiente())
                i.setData(b[z]);
                z++;
            exp *= 10;
            }
        }
    }
}