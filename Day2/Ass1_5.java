//Write a program to convert state of Byte instance into byte,
//short, int. long, float and double.
class Ass1_5
{
    public static void main(String [] args)
    {
        byte value = 123;
        Byte b = new Byte (value); //Byte instance

      byte num1 = b.byteValue();// instance method so called on object referance 
      System.out.println("num1 :"+num1);
      
      short num2 = b.shortValue();
      System.out.println("num2 :"+num2);

     int  num3 = b.intValue();
     System.out.println("num3 :"+num3);

     float num4 = b.floatValue();
     System.out.println("num4 :"+num4);

     double num5 = b.doubleValue();
     System.out.println("num5 :"+num5);


    }
}