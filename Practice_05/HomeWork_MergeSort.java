package Practice_05;

import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

/*
 * Сортировка слиянием
 */
public class HomeWork_MergeSort {
    public static void main(String[] args) {
        int[] array = {5,1,2,4,8,0,3}; 
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
    private static void mergeSort(int[] array, int begin, int end) {
        if(begin == end) // массив размера 1 всегда отсортирован
            return;

        int mid = (begin + end)/2;
        // Левая половинка: begin ... mid
        // Правая половинка: mid + 1 ... end
        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);

        // здесь написать слияние
        int[] sorted = new int[array.length];
        int inLeft = begin, inRight = mid+1,inSorted = begin;
        int endLeft = mid + 1, endRight = end +1;
        while (inLeft < endLeft || inRight < endRight){ // пока хотябы одно не закончилось
            if (inLeft < endLeft && inRight < endRight){ // оба массива не закончились
                if (array[inLeft] < array[inRight]) // победил левый массив
                    sorted[inSorted++] = array[inLeft++];
                
                else
                    sorted[inSorted++] = array[inRight++];
                
            }
            else if (inLeft<endLeft) // Левый не закончился, а правый закончился
                sorted[inSorted++] = array[inLeft++];
            else if (inRight<endRight) // левый закончился, а првый нет
                sorted[inSorted++] = array[inRight++];
            else 
                throw new IllegalStateException ("Невозможно сюда попасть");
        }
        // Слияние закончено, переносим данные из массива копии
        for (int i = begin ; i <= end; i ++)
            array[i] = sorted[i];
    }
}
