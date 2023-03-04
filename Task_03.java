// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// /*
//  * Напишите метод, который составит строку, 
//  * состоящую из 100 повторений слова TEST и метод, 
//  * который запишет эту строку в простой текстовый файл, 
//  * обработайте исключения.
//  * 
//  */

// public class Task_03 {
//     public static void main(String[] args) {
//         Scanner scr = new Scanner(System.in);
//         System.out.println("Write word on the repeat: ");
//         String text = scr.nextLine();
//         writeString(repeatString(text));
//         scr.close();

//     }
//     private static  String  repeatString (String part){
//         StringBuilder fullMaker = new StringBuilder();
//         for (int i = 0; i < 100; i++) {
//             fullMaker.append(part);
//         }
//         return fullMaker.toString();
//     }
//     private static void writeString(String string){
//         FileWriter file = null;
//         try{
//         file = new FileWriter("Test.txt");
//         file.append(string);
//         System.out.println("File add");
//         }
//         catch(IOException ex){
//             System.err.println("Mistake :" + ex);
//         }
//         finally{
//             if(file != null) {
//                 try{
//                     file.close(); 
//                 }
//                 catch(IOException ex){
//                     System.err.println("Error :" + ex);
//                 }                
//             }
//         }
//     }
// }


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Напишите метод, который составит строку, 
 * состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, 
 * обработайте исключения.
 * 
 */

public class Task_03 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write word on the repeat: ");
        String text = scr.nextLine();
        writeString(repeatString(text));
        scr.close();

    }
    private static  String  repeatString (String part){
        StringBuilder fullMaker = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            fullMaker.append(part);
        }
        return fullMaker.toString();
    }
    private static void writeString(String string){
        try(FileWriter file = new FileWriter("Test.txt")){
        file.append(string);
        System.out.println("File add");
        }
        catch(IOException ex){
            System.err.println("Mistake :" + ex);
        }
    }
}
