package com.mycompany.selectionsortvisual;

import java.util.Arrays;

public class SelectionSortVisual {

    public static void selectionSort(int[] array) {
        int n = array.length;

        System.out.println("Vetor inicial: " + Arrays.toString(array));
        System.out.println("----------------------------------");

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            System.out.println("Iteracao " + (i + 1));
            System.out.println("Assumindo menor valor na posicao " + i + ": " + array[i]);

            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparando " + array[j] + " com " + array[minIndex]);

                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    System.out.println("Novo menor encontrado: " + array[minIndex] + " na posicao " + minIndex);
                }
            }

            if (minIndex != i) {
                System.out.println("Trocando " + array[i] + " pelo " + array[minIndex]);

                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            } else {
                System.out.println("Nenhuma troca necessaria");
            }

            System.out.println("Estado atual do vetor: " + Arrays.toString(array));
            System.out.println("----------------------------------");
        }

        System.out.println("Vetor ordenado: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        selectionSort(array);
    }
}