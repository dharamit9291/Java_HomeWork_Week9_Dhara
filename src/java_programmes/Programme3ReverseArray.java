package java_programmes;
//Write a Java program to reverse an array of integer values
import java.util.Arrays;

public class Programme3ReverseArray {

    public static void main(String[] args) {
        integerValue();
    }

    public static void integerValue() {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
     System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
                System.out.println();
                System.out.println("Array in reverse order: ");

                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
