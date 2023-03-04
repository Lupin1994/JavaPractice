package Practice_01;
import java.util.Scanner;

/*
 * Задача 1. 
 *  Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 * 
 */
import java.util.Scanner;
public class Task_02 {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner sc = new Scanner(System.in,"cp866"); // cp 866 - Чтобы русский язык выводился
        String i = sc.nextLine();
        //System.out.println(String.format("Hello, %s!", i)); // Чтобы вывести в определенном формате
        System.out.printf("Hello, %s! \n", i);
        sc.close();
    }
}
