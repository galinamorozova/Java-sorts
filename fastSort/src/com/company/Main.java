package com.company;
import java.util.Arrays;

// в метод сортировки входит массив, и 2 числа - начало и конец массива.
// определяем 2 маркера - левый и правый
// определяем середину - элемент в массиве под индексом посередине между левым и правым индексом (изначально это будет
//между первым и последним индексом, а потом половина массива..четверть массива и т.д.
// до тех пор пока левый маркер <= правому (do while):
// 1. начинаем двигать маркер левый до середины ++ (число в массиве под индексом левого маркера меньше среднего числа),
// правый тоже до середины -- (пока число в массиве больше среднего числа)
// 2. при каждом передвижении проверяем, если левый маркер <= правому, то сдвигаем маркеры еще на одно положение, но по дополнительной проверке
// если если леый маркер меньше, то сначала swap значений еще производим.
// дальше получается, что левый маркер и правый маркер перевалили за середину, далее берем новые массивы от левого маркера до правой границы
//и наоборот и вызываем сортировку с массивом и новыми числами (левый маркер, правая граница и наоборот. и так пока левый маркер
// не будет больше чем правая граница - то есть пока не дойдет до конца массива.

public class Main {
    public static void main(String[] args) {
        int[] array = {11, 3, 14, 4, 56, 23};
        Helper helper = new Helper();
        helper.sort(array, 0, array.length-1);
    }
}

class Helper {

    public static void sort(int[] mas, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int middlePoint = mas[(leftMarker+rightMarker)/2];

        do {
            while (mas[leftMarker]< middlePoint){
                leftMarker++;
            };
            while (mas[rightMarker] > middlePoint) {
                rightMarker--;
            }
            while (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int container = mas[leftMarker];
                    mas[leftMarker] = mas[rightMarker];
                    mas[rightMarker] = container;
                }
                leftMarker++;
                rightMarker--;
            }

        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            sort(mas, leftMarker, rightBorder);
        }
        if (rightMarker > leftBorder) {
            sort(mas, leftBorder, rightMarker);
        }
        System.out.println(Arrays.toString(mas));
    }

}
