// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

public class HomeWork_04 {
    public static void main(String[] args) {
        int a = 20, b = 5, x = 0, y = 0, sum = 69;
        
        for (int ax = 0; ax < 10; ax++) {
            for (int ay = 0; ay <= 90; ay = ay + 10) {
                x = a + ax;
                y = ay + b;
                if ((x + y) == sum) {
                    System.out.format("%d + %d = %d\n", x, y, sum);
                    return;
                }
        
            }
        
        }
    }
}
