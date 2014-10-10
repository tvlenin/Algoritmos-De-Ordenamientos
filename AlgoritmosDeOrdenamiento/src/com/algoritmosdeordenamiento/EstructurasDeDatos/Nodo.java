package com.algoritmosdeordenamiento.EstructurasDeDatos;

public class Nodo<E>{ //<E extends Comparable> implements Comparable<Nodo<E>>
    protected E dato;
    protected Nodo<E> siguiente;
    protected Nodo<E> previo;
    
    
    public Nodo(E dato){
        this(dato,null,null);
    }
    
    public Nodo(E pDato, Nodo<E> pSiguiente, Nodo<E> pPrevio){
        this.dato = pDato;
        this.siguiente = pSiguiente;
        this.previo = pPrevio;
    }
    
    public void setData(E pData){
        this.dato = pData;
    }
    public E getDato(){
        return dato;
    }
    
    public Nodo<E> getSiguiente(){
        return siguiente;
    }
    public Nodo<E> getPrevio(){
        return previo;
    }

    /*@Override
    public int compareTo(Nodo<E> t) {
        System.out.println("adivine que");
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}

