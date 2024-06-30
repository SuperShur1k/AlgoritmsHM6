package org.example.lesson6hm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    //    b. Написать код, который принимает на вход массив и число элементов,
//    и возвращает новый массив, который содержит все элементы исходного массива и заданное число новых элементов.
    public static void main(String[] args) {
        Integer[] originalArray = {1, 2, 3, 4, 5};
        int additionalElements = 3;

        Integer[] extendedArray = extendArray(originalArray, additionalElements);

        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        System.out.println("Расширенный массив: " + Arrays.toString(extendedArray));
    }

    public static Integer[] extendArray(Integer[] arr, int numElements) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < numElements; i++) {
            list.add(arr.length + i + 1);
        }

        Integer[] extendedArray = new Integer[list.size()];
        extendedArray = list.toArray(extendedArray);

        return extendedArray;
    }
}
