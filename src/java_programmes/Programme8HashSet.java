package java_programmes;
import java.util.HashSet;
import java.util.Map;

/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
        Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
        and if else)*/
public class Programme8HashSet {

    public void integerObjects() {
        HashSet<Integer> num = new HashSet();
        num.add(4);
        num.add(7);
        num.add(8);
        for(int i = 1; i <= 10; i++) {
            if(num.contains(i)) {
                System.out.println(i + " found in the set.");
            } else {
                System.out.println(i + " not found in the set.");
            }
        }
    }
    public static void main (String[]args){
    Programme8HashSet obj = new Programme8HashSet();
    obj.integerObjects();
    }
}