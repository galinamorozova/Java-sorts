package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] mas = {11, 3, 14, 4, 56, 4};
        //итерируем массив
        //сравниваем крайние значения, если надо меняем
        //сдвигаемся на одну
        int leftPosition = 0;

        int container = 0;
        for (; leftPosition < mas.length; leftPosition++) {
            for (int k = leftPosition; k < mas.length; k++) {
                if (mas[k] < mas[leftPosition]) {
                    container = mas[k];
                    mas[k] = mas[leftPosition];
                    mas[leftPosition] = container;

                    k = leftPosition;
                    System.out.println(Arrays.toString(mas));

                } else {
                    System.out.println(Arrays.toString(mas));
                }
            }
        }
    }
}
