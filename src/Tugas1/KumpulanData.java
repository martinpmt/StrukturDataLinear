/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Arrays;

/**
 *
 * @author basisb08
 */
public class KumpulanData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[] = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100}; //jumlah idx 24
        System.out.println("Data \t\t: " + Arrays.toString(data));
        System.out.println("===============================================================================================================");
        System.out.println("Bubble Sort");
        System.out.println("Ascending\t: " + Arrays.toString(BubbleSortAsc(data)));
        System.out.println("Descending\t: " + Arrays.toString(BubbleSortDesc(data)));
        System.out.println("===============================================================================================================");
        System.out.println("Selection Sort");
        System.out.println("Ascending\t: " + Arrays.toString(SelectionSortAsc(data)));
        System.out.println("Descending\t: " + Arrays.toString(SelectionSortDesc(data)));
        System.out.println("===============================================================================================================");
        System.out.println("Insertion Sort");
        System.out.println("Ascending\t: " + Arrays.toString(InsertionSortAsc(data)));
        System.out.println("Descending\t: " + Arrays.toString(InsertionSortDesc(data)));
    }

    public static int[] BubbleSortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }

        }
        return array;
    }

    public static int[] BubbleSortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }

        }
        return array;
    }

    public static int[] SelectionSortAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
        return array;
    }

    public static int[] SelectionSortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
        return array;
    }

    public static int[] InsertionSortAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int point = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > point)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = point;
        }
        return array;
    }

    public static int[] InsertionSortDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int point = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] < point)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = point;
        }
        return array;
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int swap = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = swap;
    }
}
