import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<User, Integer> map = new TreeMap<>();
        User ivan1 = new User("Ivan", "Ivanov", 31);
        User peter = new User("Peter", "Petrov", 32);
        User alex = new User("Alexandr", "Alexandrov", 33);
        map.put(ivan1, 1);
        map.put(peter, 2);
        map.put(alex, 3);

        System.out.println("Working with keySet() ...");
        for (User u : map.keySet())
        {
            System.out.println(u + " :: id = " + map.get(u));
        }

        System.out.println("\n\nWorking with entrySet() ...");
        for (Map.Entry<User, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " ---> " + e.getValue());
        }
    }
}
