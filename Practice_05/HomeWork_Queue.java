package Practice_05;
/*
 *  Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди, 
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.*;

import javax.print.attribute.standard.MediaSizeName;

public class HomeWork_Queue {
   private static LinkedList<Integer> list = new LinkedList<>();
   public static void main(String[] args) {
      enqueue(1);
      enqueue(2);
      enqueue(3);
      enqueue(4);

      System.out.println(size());
      System.out.println(isEmpty());

      System.out.println(dequeue());
      System.out.println(dequeue());
      System.out.println(dequeue());
   }
   public static void enqueue(int element){
      list.addLast(element);
   }
   public static int dequeue(){
      return list.removeLast();
   }
   public static int first(){
      return list.getFirst();
   }
   public static int size(){
      return list.size();
   }
   public static boolean isEmpty(){
      return list.isEmpty();
   }

}
