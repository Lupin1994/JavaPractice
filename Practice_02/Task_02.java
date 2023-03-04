package Practice_02;
import java.util.Scanner;

/*
 * Напишите метод, который принимает на вход строку (String) 
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 * 
 */

public class Task_02 {
   public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write string: ");
        String str = scr.nextLine();
        
        System.out.println(isPolindrom(str));
        
        scr.close();
   }
   private static boolean isPolindrom(String str){
        for (int i = 0; i < str.length() - i; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
   } 
}
