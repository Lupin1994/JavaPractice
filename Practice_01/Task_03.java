package Practice_01;
/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], 
 * вывести максимальное количество подряд идущих 1.
 * 
 * 
 */

public class Task_03 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1,1,1,1,1,1,1 ,0, 1, 1, 1, 1, };
        int count = 0;
        int MaxLenght = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > MaxLenght) {    // Если текущая цепочка длиннее найденной ранее, 
                                     //то мы перезаписываем максимальное значение
                    MaxLenght = count;
                }
                count = 0;
            }
        }
        if (count > MaxLenght) {  // если последняя цепочка больше найденной ранее, перезаписываем ее
            MaxLenght = count;
        }
        count = 0;
        System.out.println(MaxLenght);
    }
}
