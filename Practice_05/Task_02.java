package Practice_05;
/*
 *  Написать программу, определяющую правильность расстановки скобок в выражении.
    Пример 1: a+(d*3) - истина
    Пример 2: [a+(1*3) - ложь
    Пример 3: [6+(3*3)] - истина
    Пример 4: {a}[+]{(d*3)} - истина
    Пример 5: <{a}+{(d*3)}> - истина
    Пример 6: {a+]}{(d*3)} - ложь
 * 
 */

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Task_02 {
    public static void main(String[] args) {
        String formula = "[a+(1*3";
        
        System.out.println(isValid(formula));
    }
    private static boolean isValid(String formula) {
        Map<Character,Character> bracketsDict = new HashMap<>();
        bracketsDict.put('(', ')');
        bracketsDict.put('{', '}');
        bracketsDict.put('[', ']');
        bracketsDict.put('<', '>');

        ArrayDeque <Character> brackets = new ArrayDeque<>();
        for (char c : formula.toCharArray()) {
            if(bracketsDict.containsKey(c)){ // если "с" является открывающей скобкой
                brackets.add(c);
            }
            else if (bracketsDict.containsValue(c)){ // если "с" закрывающей скобкой
                if(brackets.isEmpty()){
                    return false;
                }
                char openingBrecket = brackets.removeLast();
                if(bracketsDict.get(openingBrecket) != c){ // если закрывающая скобка  не соответствует открывающей
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}
