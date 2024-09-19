package com.example.task10;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int minimalElem = Arrays.stream(arr).min().getAsInt();
        int counter = 0;
        int index = 0;
        for (int elem : arr){
            if (elem == minimalElem){
                index = counter;
            }
            counter++;
        }
        return index;
    }

}