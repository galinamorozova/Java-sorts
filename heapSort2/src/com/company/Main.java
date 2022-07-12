package com.company;

import java.util.Arrays;

// нужен метод определения индекса правого узла потомка
// нужен метод определения индекса левого узла потомка
// нужен метод перестановки двух элементов массива swap
// нужен метод создания кучи, в котором вызывается метод переупорядочивания кучи так чтобы
// нужен метод переупорядочивания кучи, так чтобы индекс родителя всегда был больше индекса ребенка
// нужен итоговый метод сортировки, в котором и будет сначала создаваться куча, потом переупорядовачиваться


public class Main {

    public static void main(String[] args) {
        int[] array = {11, 3, 14, 4, 56, 23};
        Helper helper = new Helper();
        helper.sort(array);
    }
}

class Helper {

    private static int heapSize;


    public static void sort(int[] mas) {
        buildHeap(mas);
        while (heapSize > 1) {
            swap(mas, 0, heapSize-1);
            heapSize--;
            heapify(mas, 0);
            System.out.println(Arrays.toString(mas));
        }
        System.out.println(Arrays.toString(mas));
    }

    // метод построения кучи: листья начинаются с длина массива минус 1. начинаем с первых подродителей и идем выше к родителю
    // при каждом шаге цикла вызываем упорядочивание дерева

    private static void buildHeap (int[] mas) {
        heapSize = mas.length;
        for (int i = mas.length/2 - 1; i >= 0; i --) {
            heapify(mas, i);
        }

    }

    // метод упорядочивания бинарного дерева:  i - индекс родителя, получаем индексы правого и левого ребенка,
    //если число в массиве с порядковым номером индекса ребенка больше числа в массиве с порядковым номером максимального,
    // этот порядковый номер признается максимальным и родительским. Если зашедший (родительский) индекс не равен самому большому, то
    // меняем местами числа под этими индексами местами.
    // рекурсивно вызываем тот же метод упорядочивания бинарного дерева


    private static void heapify (int[] mas, int i) {
        int largest = i;
        int l = left(i);
        int r = right(i);
        if ( l < heapSize && mas[l] > mas[largest]) {
            largest = l;
        }
        if (r < heapSize && mas[r] > mas[largest]) {
            largest = r;
        }
        if (i != largest) {
            swap(mas, i, largest);
            heapify(mas, largest);
        }
    }


    // правило построения бинарного дерева: индекс левого ребенка равен индекс родителя умножить на 2 + 1, а
    // индекс правого ребенка равен индекс родителя умножить на 2 + 2

    private static int left (int i) {
        return 2 * i + 1;
    };
    private static int right (int i) {
        return 2 * i + 2;
    }

    private static void swap (int [] mas, int i, int j) {
        int container = mas[i];
        mas[i] = mas[j];
        mas[j] = container;
    }


}

