/*
 *  1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
    2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
 * 
 */
package Practice_04;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_00 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Заполнение Array заняло" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();

        LinkedList<Integer> Llist = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            Llist.add((int) (Math.random() * 100));
        }
        System.out.println("Заполнение LinkedList заняло" + (System.currentTimeMillis() - time));
    }
}
