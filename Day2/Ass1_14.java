import java.util.Scanner;
// Write a program to find minimum and maximum number as well as
// to add two integer numbers using methods of Integer.
class Ass1_14{
    public static void main (String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first integer value: ");
         int num1 = sc.nextInt();
    
          System.out.println("Enter second integer value: ");
          int num2 = sc.nextInt();

         int min = Integer.min(num1,num2);
         int max = Integer.max(num1,num2);

         System.out.println("MIN value is : "+min);
         System.out.println("MAX value is : "+max);

         int sum = Integer.sum( num1,num2 );
         System.out.println("sum of 2 number is >> "+sum);

    }
}