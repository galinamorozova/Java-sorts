package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 4, 56, 23};

        // итериремся по массиву слева направо
        //сравниваем два соседних значения (текущее с ЛЕВЫМ)
        //swap если надо
        //тут же проверяем массив СЛЕВА на необходимость свапа
        //идем дальше

        for (int i = 1; i < mas.length; i++) {
            int container = 0;
            int container2 = 0;
            if (mas[i] < mas[i - 1]) {
                container = mas[i];
                mas[i] = mas[i - 1];
                mas[i - 1] = container;
                System.out.println(Arrays.toString(mas));

                for (int j = i; i > 0; j--) {
                    if (mas[j] < mas[j - 1]) {
                        container2 = mas[j];
                        mas[j] = mas[j - 1];
                        mas[j - 1] = container2;
                        System.out.println(Arrays.toString(mas));
                    } else {
                        System.out.println(Arrays.toString(mas));
                        break;
                    }
                }
            }
        }
    }
}
