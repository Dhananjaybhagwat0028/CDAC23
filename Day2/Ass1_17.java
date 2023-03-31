// 21.Write a program to convert state of Long instance into byte,
// short, int, long, float and double.
class Ass1_17
{
    public static void main(String [] args)
    {
         Long value = 3567L;
         Long b = new Long(value); //Long instance

         byte num1 = b.byteValue();
         System.out.println("num1 :"+num1);

         long  num3 = b.longValue();
         System.out.println("num3 :"+num3);

         short num2 = b.shortValue();
         System.out.println("num2 :"+num2);

         float num4 = b.floatValue();
         System.out.println("num4 :"+num4);

         double num5 = b.doubleValue();
         System.out.println("num5 :"+num5);
    }
}