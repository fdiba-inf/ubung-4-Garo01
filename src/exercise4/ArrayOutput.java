package exercise4 ;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] numbers = new int[a];
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        int i = 0;
      while (i<numbers.length) { 
        for (int b=0; b<i; b++) {
         System.out.print (" ");
        }
        System.out.println (numbers[i]);
      i++;  

      }

      
    }

}
