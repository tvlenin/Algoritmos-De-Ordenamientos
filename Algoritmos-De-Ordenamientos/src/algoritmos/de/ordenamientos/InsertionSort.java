/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.de.ordenamientos;

import static algoritmos.de.ordenamientos.SelectionSort.intercambiar;
import java.util.Arrays;

/**
 *
 * @author tvlenin
 */
public class InsertionSort {
    public static void insertion(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static <E extends Comparable> void InsertionArray(E a[])
    {
        System.out.println(Arrays.toString(a));
        for (int i = 1; i < a.length; i++) {
            E valueToSort = a[i];
            int j = i;
            System.out.println(a[j - 1].compareTo(valueToSort) > 0);
            while (j > 0 && a[j - 1].compareTo(valueToSort) > 0) {   
                a[j] = a[j - 1];
                j--;
            }
            a[j] = valueToSort;
        }
        System.out.println(Arrays.toString(a));
    }
    
}
