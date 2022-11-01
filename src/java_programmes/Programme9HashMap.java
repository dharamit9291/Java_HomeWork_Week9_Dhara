package java_programmes;
import java.util.*;
/*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map*/
public class Programme9HashMap {
    public static void main(String[] args) {
        Programme9HashMap obj = new Programme9HashMap();
        obj.person();
    }
    public void person() {
        Map<String, Integer> persons = new HashMap<String, Integer>();
        persons.put("Andy ", 30);
        persons.put("Brian ", 35);
        persons.put("Charlie", 38);
        persons.put("Dan", 40);

        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
            String key = entry.getKey();
            Integer Value = entry.getValue();
            System.out.println(key + " = Age " + Value);
        }
    }
}



