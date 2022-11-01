package java_programmes;
/*Write a Java program to test an array list is empty or not. Define array list with
        underground tube names*/
import java.util.ArrayList;

public class Programme7ArrayListEmpty {
    public static void main(String[] args) {
        isTubeStationList();
    }
    public static void isTubeStationList() {
        ArrayList<String> tube = new ArrayList<String>();
        tube.add("Baker Street");
        tube.add("Finchley Road");
        tube.add("Wembly Park");
        tube.add("Preston Road");
        tube.add("Northwick Park");
        tube.add("Harrow-on-the-Hill");
        System.out.println("Original array list with underground tube stations: " + tube);
        System.out.println("Check if the above array list is empty or not! "+tube.isEmpty());
        tube.removeAll(tube);
        System.out.println("Array list after removing all tube stations "+tube);
        System.out.println("Check if the above array list is empty or not! "+tube.isEmpty());
    }
}
