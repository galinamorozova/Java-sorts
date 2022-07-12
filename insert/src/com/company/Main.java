package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] mas = {11, 3, 14, 4, 56, 7};

        //итерируемся по массиву
        //вносим значение позиции в переменную
        // внутри делаем еще итерацию массива ВЛЕВО от позиции
        // сравниваем значения со значением позиции
        // меняем если надо

        for (int left = 0; left < mas.length; left++) {
            System.out.println(Arrays.toString(mas));
            int i = left - 1;
            int value = mas[left];
            for (; i >= 0; i--) {
                if (mas[i] > value) {
                    mas[i+1] = mas[i];
                    mas[i] = value;
                    System.out.println(Arrays.toString(mas));
                } else {
                    System.out.println(Arrays.toString(mas));
                    break;
                }
            }
            System.out.println(Arrays.toString(mas));
        }

    }
}





