
import com.sun.jdi.Value;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

int[] values2 = {5, 7, 2, 8, 9, 1};
        System.out.println("The unsorted values are: ");
        for(int p = 0; p < values2.length; p++)
            System.out.println(values2[p]+"");
        System.out.println();

        selectionSort(values2);

        System.out.println("The sorted values are: ");
        for(int p = 0; p < values2.length; p++)
            System.out.println(values2[p]+"");
        System.out.println();
               }
                
                
                 public static void selectionSort(int[] array){
        int startScan;
        int index;
        int minIndex;
        int minValue;
        for(startScan = 0; startScan < (array.length);){
            minIndex = startScan;
            minValue = array[startScan];
            for(index = startScan + 1; index < array.length;) {

                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
        }
    }
        }