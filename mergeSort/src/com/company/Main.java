package com.company;

import java.util.Arrays;

//определяем середину
//делим и создаем 2 массива
//копируем 1ую половину изначального массива в 1 подмассив
//копируем 2ую половину изначального массива во 2 подмассив
//рекурсивно вызываем этот же метод для разделения подмассивов до размера массива меньше 2
// сличаем каждый элемент подмассивов
// если в левом подмассиве меньше чем в правом, то копируем это значение в изначальный массив
// и увеличиваем левый элемент++
// если слева больше, то копируем значение элемента правого подмассива в изначальный и сдвигаем уже его
//если элементов подмассива в левом не осталось, то копируем правый
//если не осталось элементов в правом подмассиве, то копируем левый


public class Main {

    public static void main(String[] args) {
        int[] array = {11, 3, 14, 4, 56, 23, 87, 45, 34, 12, 987, 234, 54, 9, 1};
        Helper helper = new Helper();
        helper.mergeSort(array,  array.length);
    }
}

class Helper {
    public static void mergeSort(int[] array, int right) {
        if (right < 2) {
            return;
        }
        int mid = right / 2;
        int[] l = new int[mid];
        int[] r = new int[right - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < right; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, right - mid);

        merge(array, l, r, mid, right - mid);
        System.out.println(Arrays.toString(array));
    }


    public static void merge(int[] array, int[] l, int[] r, int leftLenght, int rightLenght) {

        int i = 0, j = 0, k = 0;
        while (i < leftLenght && j < rightLenght) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                k++;
                i++;
            } else {
                array[k] = r[j];
                k++;
                j++;
            }
        }
        while (i < leftLenght) {
            array[k] = l[i];
            k++;
            i++;
        }
        while (j < rightLenght) {
            array[k] = r[j];
            k++;
            j++;
        }
    }

}

