package com.company;
import java.util.Arrays;

 //System.out.println(Arrays.toString(mas));

public class Main {

    //аля пузырьковая
    //но каждую итерацию расстояние между сравниваемыми позициями сокращается вдвое
    //внешняя итерация на один шаг
    // внутренняя: смещаемся на space влево, сравниваем позицию с позицией на space вправо
    //уменьшаем спейс вдвое
    //и все это под условием пока спейс не станет равным 1

    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 4, 56, 23, 45, 87, 34, 12, 987, 234, 54, 9};
        int space = mas.length/2;
        int container;

        while (space >= 1) {
            for (int i = 0; i < mas.length; i++) {
                System.out.println(Arrays.toString(mas));

                for (int j = i - space; j >= 0; j-=space) {
                    if (mas[j] > mas[j+space]) {
                        container = mas[j];
                        mas[j] = mas[j+space];
                        mas[j+space] = container;
                        System.out.println(Arrays.toString(mas));
                    }
                }
            }
            space= space/2;
            System.out.println(Arrays.toString(mas));
        }
    }
}
