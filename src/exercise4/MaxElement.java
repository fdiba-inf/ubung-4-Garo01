package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        double [] numbers = new double[count];

         
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
        }
      double max=numbers[0];
       for ( int index=1 ; index<numbers.length ; index++){
         if (max<numbers[index]){
           max=numbers[index];
         }
       }
