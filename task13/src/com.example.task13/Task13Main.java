package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        int n = arr.length;
        int countOfElemsBiggerThan1000 = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > 1000) countOfElemsBiggerThan1000++;
        }
        int[] resArr = new int[n-countOfElemsBiggerThan1000];
        int counter = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] <= 1000){
                resArr[i-counter] = arr[i];
            }
            else {
                counter++;
            }
        }
        return  resArr;
    }

}