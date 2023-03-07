/*
 *  Заполнить список десятью случайными числами.
    Отсортировать список методом sort() и вывести его на экран.
 * 
 */


package Practice_03;

import java.util.ArrayList;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(0,11));
        }
        System.out.println(list);

        //list.sort(null);
        list.sort(new MyComparator());
        System.out.println(list);
    }
}
