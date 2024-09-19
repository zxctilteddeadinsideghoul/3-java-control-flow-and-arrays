package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int minimalElem = 2147483647;
        int indexOfMinimalElem = 0;
        int counter = 0;
        for (int elem : arr){
            if (elem < minimalElem){
                minimalElem = elem;
                indexOfMinimalElem = counter;
            }
            counter++;
        }
        arr[indexOfMinimalElem] = arr[0];
        arr[0] = minimalElem;
    }

}