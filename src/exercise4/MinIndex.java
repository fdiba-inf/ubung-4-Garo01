package exercise4;
import java.util.Scanner;
import java.util.Arrays;
public class MinIndex{
  public static void main (String[]args){
     Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int[] numbers = new int[a];
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
            
        } 
    int index = 0;
    int min = numbers[0];
    for (int j = 1; j < numbers.length; j++) {
      if(min > numbers[j]) {
        min = numbers[j];
        index = j;
      }
      }
      System.out.println("Min index: " + index);
        }
        
        
} 
