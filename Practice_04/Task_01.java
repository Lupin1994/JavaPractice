/*
 *  Реализовать консольное приложение, которое:
    Принимает от пользователя строку вида 
    text~num
    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
    Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

package Practice_04;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {
        System.out.println("write text such as  text/num");
        Scanner sc = new Scanner((System.in));

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 5; i++){

            String listText = sc.nextLine();
            String [] listTextArray = listText.split("/");
            listText = listTextArray[0];
            int textPos = Integer.parseInt(listTextArray[1]);
            if (listText.equals("Print")){
                System.out.println(list.get(textPos));
                list.remove(textPos);
            }
            else{
                list.add(textPos, listText);
            }            
        }
        System.out.println(list);
        sc.close();
    }
}
