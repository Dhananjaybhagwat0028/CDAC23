// .Write a program to convert state of Short instance into byte,
// short, int, long, float and double
class Ass1_10
{
    public static void main(String [] args)
    {
        short value = 3567;
        Short b = new Short (value); //Short instance

     short num2 = b.shortValue();
     System.out.println("num2 :"+num2);

      byte num1 = b.byteValue();// instance method so called on object referance 
      System.out.println("num1 :"+num1);
      
      int  num3 = b.intValue();
      System.out.println("num3 :"+num3);

      float num4 = b.floatValue();
      System.out.println("num4 :"+num4);

      double num5 = b.doubleValue();
      System.out.println("num5 :"+num5);
    }
}