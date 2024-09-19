package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null) return;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indexOfMinimalElem = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indexOfMinimalElem]) {
                    indexOfMinimalElem = j;
                }
            }

            int temp = arr[indexOfMinimalElem];
            arr[indexOfMinimalElem] = arr[i];
            arr[i] = temp;
        }
    }

}