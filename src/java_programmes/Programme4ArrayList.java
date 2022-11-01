package java_programmes;

import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop*/
public class Programme4ArrayList {
    public static void main(String[] args) {
        Programme4ArrayList obj = new Programme4ArrayList();
        obj.getColours();
    }

    public void getColours() {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("White");
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Black");
        colours.add("Purple");

        for (String col:colours) {
            System.out.println(col);
        }
    }
}