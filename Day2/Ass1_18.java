import java.util.*;
// 22. Write a program to find minimum and maximum number as well as
// to add two long numbers using methods of Long.
class Ass1_18{
    public static void main (String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first long value: ");
         long num1 = sc.nextLong();
    
          System.out.println("Enter second long value: ");
          long num2 = sc.nextLong();

         long min = Long.min(num1,num2);
         long max = Long.max(num1,num2);

         System.out.println("MIN value is : "+min);
         System.out.println("MAX value is : "+max);

         long sum = Long.sum( num1,num2 );
         System.out.println("sum of 2 number is >> "+sum);


    }
}