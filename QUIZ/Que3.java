import java.util.Scanner;
// Write a Java program to convert minutes into a number of years and days
class Que3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter min value:");
        float  min = sc.nextFloat();
        float year,days;
       System.out.println("years >>"+(min/525600));
       System.out.println("days  >>"+(min/1440)) ;

    }

}