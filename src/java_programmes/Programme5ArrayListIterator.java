package java_programmes;
/* Write a Java program to iterate through all elements in an array list using
        Iterator*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Programme5ArrayListIterator {
    public void elementIterator() {

        ArrayList<String> element = new ArrayList<String>();
        element.add("Wood");
        element.add("Metal");
        element.add("Water");
        element.add("Fire");
        element.add("Air");
        element.add("Earth");
        Iterator itr=element.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        Programme5ArrayListIterator obj  = new Programme5ArrayListIterator();
        obj.elementIterator();
    }
}
