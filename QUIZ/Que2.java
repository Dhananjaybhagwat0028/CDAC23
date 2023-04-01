// 2. Write a Java program to find the k largest elements in a given array. Elements in the array
// can be in any order (Use scanner class to input and Array, below picture is example do not
// make static array as repsrented in example).
import java.util.*;
public class Que2{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of the array: ");
         int size = sc.nextInt();
         int[] array = new int[size];

           
         System.out.println("Enter the elements of the array: ");
           for (int i = 0; i < size; i++) 
           {
            array[i] = sc.nextInt();
           }
         
         System.out.println("Enter the value of k: ");
         int k = sc.nextInt();
         Arrays.sort(array);
           
         for (int i: array)
         {
          System.out.println(i+" ");
         }


         for (int i = size - 1; i >= size - k; i--) 
         {
         System.out.print("greatest k no.of value>> "+array[i] + " ");
         }
            
    }
}