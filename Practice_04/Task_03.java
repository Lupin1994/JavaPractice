/*
 *  Реализовать консольное приложение, которое:
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
 * 
 */



package Practice_04;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> list = new ArrayDeque<>();
        String command = "";
        while(!command.equals("q")){
            command = sc.nextLine();

            if(command.equalsIgnoreCase("print")){
                System.out.println(list);
            }
            else if (command.equalsIgnoreCase("revert")){
                list.pop(); // удаление верхушки
            }
            else{
                list.push(command);
            }

        }
        for(String string : list){
            System.out.println(string);
        }
        System.out.println(list);
        sc.close();
    }
}
