/*Write a Java program to display the speed, in meters per second, kilometers per hour and
miles per hour. User Input : Distance (in meters) and the time was taken (as three numbers:
hours, minutes, seconds). Note : 1 mile = 1609 meters [5 Marks]
Test Data:->Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23*/

import java.util.Scanner;

class Que4{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Meter :");
      float Meter = sc.nextFloat();

      System.out.println("Hour :");
      float Hour = sc.nextFloat();

      System.out.println("Minutes :");
      float Minute = sc.nextFloat();

      System.out.println("Second :");
      float Second = sc.nextFloat();

      float Sec = (Hour * 3600) + (Minute * 60) + (Second);
      System.out.println(Sec);

      float kmhr = (Meter * 3600) / (Sec * 1000);
      float msec = (Meter / Sec);
      double miles = (Meter / Sec) * (3600 / 1000) * (1 / 1.609);

      System.out.println("Speed in km/hr :" + kmhr);
      System.out.println("Speed in m/sec :" + msec);
      System.out.println("Speed in miles/hr :" + miles);

   }

}
