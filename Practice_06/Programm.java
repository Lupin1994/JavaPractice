package Practice_06;
/*
 *  1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.

 */
import java.time.LocalDate;

public class Programm {
    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination("Столбняк", LocalDate.of(2021, 3, 10), "Bayer");
        System.out.println(vaccination);
        // vaccination.setDate(LocalDate.of(2001, 1 , 13));
        System.out.println(vaccination.getDate());
        Cat cat = new Cat("Oliver", "Vlasta","Muillo", LocalDate.of(2001, 6, 26), "red");
        cat.addVaccination(vaccination);
        cat.addVaccination(new Vaccination("Бешенство", LocalDate.of(2009, 3, 23),"Bayer" ));
        System.out.println(cat);
    }
}
