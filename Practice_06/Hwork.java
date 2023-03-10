package Practice_06;
/*
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что один человек может иметь несколько телефонов.
 */
import java.util.*;

public class Hwork {
    public static void main(String[] args) {
        Map<String, List<Integer>> namesToPhone = new HashMap<>();
        List<Integer> phones = new ArrayList<>(List.of(111111, 22222, 33333));

        namesToPhone.put("Ivan Ivanov" , phones);
        namesToPhone.put("Petr Petrov" , List.of(111112,223222,334333));
        namesToPhone.put("Sidor Sidorov" , List.of(1111811,222252,335333));

        namesToPhone.get("Ivan Ivanov").add(44444);

        System.out.println(namesToPhone.get("Ivan Ivanov"));

        Map<String, List<PhoneWithLabel>> namesToPhonesWithLabels;
        List<PhoneWithLabel> withLabels = new ArrayList<>();
        withLabels.add (new PhoneWithLabel("mobile", 77777));
        withLabels.add (new PhoneWithLabel("mobile", 99999));
        withLabels.add (new PhoneWithLabel("mobile", 8888));
        withLabels.add (new PhoneWithLabel("mobile", 7747));

        Map<String, Map<String, Integer>> namesToPhonesWithLabels_map = new HashMap<>();
        HashMap<String,Integer> ivansPhones = new HashMap<String,Integer>();

        namesToPhonesWithLabels_map.put("Ivan Ivanov", ivansPhones);

        ivansPhones.put("mobile",2323423);

        namesToPhonesWithLabels_map.get("Ivan Ivanov").put("home", 345324523);
        System.out.println(namesToPhonesWithLabels_map);
    }
}