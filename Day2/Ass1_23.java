import java.util.Scanner;
// Write a program to find minimum and maximum number as well as
// to add two float numbers using methods of Float.
class Ass1_23{
    public static void main (String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first float value: ");
         Float num1 = sc.nextFloat();
    
          System.out.println("Enter secondFloat value: ");
         Float num2 = sc.nextFloat();

         Float min =Float.min(num1,num2);
         Float max =Float.max(num1,num2);

         System.out.println("MIN value is : "+min);
         System.out.println("MAX value is : "+max);

         Float sum =Float.sum( num1,num2);
         System.out.println("sum of 2 number is >> "+sum);


    }
}
