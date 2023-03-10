package Practice_06;

import java.util.*;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
Распечатайте содержимое данного множества.
 */ 
public class Sets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(List.of(4,5,6,1,2,3,4,5,6,3));

        // hashSet.add(1);
        // hashSet.add(2);
        // hashSet.add(3);
        // hashSet.add(4);
        // hashSet.add(5);
        // hashSet.add(6);
        // hashSet.add(3);

        // hashSet.addAll(List.of(1,2,3,4,5,6,3));

        System.out.println(hashSet);

        Set<Integer> treeSet = new TreeSet<>(List.of(4,5,6,1,2,3,4,5,6,3));
        System.out.println(treeSet);

        
        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(4,5,6,1,2,3,4,5,6,3));
        System.out.println(linkedHashSet);
    }
}

