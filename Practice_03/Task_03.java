/*
 *  Создать список типа ArrayList<String>.
    Поместить в него как строки, так и целые числа.
    Пройти по списку, найти и удалить целые числа. 
 */

package Practice_03;

import java.util.ArrayList;

public class Task_03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>(); // Из-за того что слева не писали будет добавляться обьект
        list.add(4);
        list.add("hello");
        list.add("new");
        list.add(8);
        list.add(9);
        list.add("day");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);


    }
}
