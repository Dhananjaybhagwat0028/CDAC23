//1. Write a Java program that reads an integer between 10 and 1000 and adds all the digits in
//the integer. Validation: It must take only Integer inputs between 10 and 1000. [5 Marks]

import java.util.Scanner;
class Que1{
    public static void main(String []args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any digit between 10 to 1000 :");
        int var = sc.nextInt();  
          int sum =0;
         //System.out.println(var);
         if( var>=10 && var<=1000)
         { 
           while( var!=0)
           {
             int n;
             n = var % 10;
             var = var/10;
             System.out.println(n);
             sum = n + sum;
           }
           
           System.out.println(sum);
       }
       else
       {
         System.out.println("invalid input");
       }

    }
}