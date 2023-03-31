// Write a program to convert state of Integer instance into
// byte, short, int, long, float and double.
class Ass1_13
{
    public static void main(String [] args)
    {
      int value = 3567;
      Integer b = new Integer(value); //Integer instance

      int  num3 = b.intValue();
      System.out.println("num3 :"+num3);

      short num2 = b.shortValue();
      System.out.println("num2 :"+num2);

      byte num1 = b.byteValue();
      System.out.println("num1 :"+num1);
      
      float num4 = b.floatValue();
      System.out.println("num4 :"+num4);

      double num5 = b.doubleValue();
      System.out.println("num5 :"+num5);
    }
}