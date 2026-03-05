package com.mycompany.insertionsort;
import java.util.Arrays;

public class InsertionSort {
    
    private static void insertionSort(int[] array) {
        System.out.println("Vetor original: " + Arrays.toString(array));
        int n = array.length;
        
        for (int i = 1;i<n;i++){
            int chave = array[i];
            int j= i-1;
            
            while(j >=0 & array[j] > chave){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=chave;  
        }
        System.out.println("Vetor reordenado: " + Arrays.toString(array));
    }
    
    public static void main(String[] args) {
        int[] array = {1,4,6,34,76,23,65,26};
        insertionSort(array);
    }
}
