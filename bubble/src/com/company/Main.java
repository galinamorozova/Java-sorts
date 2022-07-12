package com.company;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int [] mas = {11, 3, 14, 4, 56, 4};
        int container;
        boolean isSorted = false;

        //итерируемся по массиву
        //в каждом цикле запускаем еще одну итерацию
        //в ходе которой сравниваем два рядом стоящих значения
        //заменяем если надо


        for (int j = mas.length-1; j >= 1; j--) {
            for (int i = 0; i < mas.length-1; i ++) {
                if (mas[i] > mas[i+1]) {
                    container = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = container;
                    System.out.println(Arrays.toString(mas));
                } else {
                    System.out.println(Arrays.toString(mas));
                }
            }
        }

//    while (isSorted = true) {
//        isSorted = true;
//        for (int k = 0; k < mas.length-1; k ++) {
//            if (mas[k] > mas[k+1]) {
//                isSorted = false;
//                container = mas[k];
//                mas[k] = mas[k+1];
//                mas[k+1] = container;
//                System.out.println(Arrays.toString(mas));
//        }
//    }
//    }
}}
