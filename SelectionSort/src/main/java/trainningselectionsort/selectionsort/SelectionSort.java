package trainningselectionsort.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        System.out.println("Vetor inicial: " + Arrays.toString(array));
        System.out.println("----------------------------------");

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
               
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        System.out.println("Vetor ordenado: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        selectionSort(array);
    }
}