package Practice_06;
/*
 *  1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.

 */
import java.time.LocalDate;

public class Vaccination {
    private String nameVaccine;
    private LocalDate date;
    private String producer;
    public Vaccination(String nameVaccine, LocalDate date, String producer) {
        this.nameVaccine = nameVaccine;
        this.date = date;
        this.producer = producer;
    }

    public LocalDate getDate(){
        return date;
    }

    // public void setDate(LocalDate date){
    //     this.date = date;
    // }

    // Вызвать лампочку ctrl + (.)
    @Override
    public String toString() {
        return "Vaccination [nameVaccine=" + nameVaccine + ", date=" + date + ", producer=" + producer + "]";
    }

    public String getNameVaccine() {
        return nameVaccine;
    }

    public String getProducer() {
        return producer;
    }

}

