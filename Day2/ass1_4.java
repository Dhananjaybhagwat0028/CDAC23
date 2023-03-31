//.Write a program to convert:
// a. byte value into String
// b. byte value into Byte instance.
// c. String instance into Byte instance.
class Ass1_4{
    //method 1
      public static void main(String[] args) {
      byte a = 123 ;
      String str = Byte.toString(a);
      System.out.println("string >> "+a);

     //method 2
     byte b = 124;
     String str1 = String.valueOf(b);
     System.out.println("string >> "+b);


     byte c = 100 ;
     Byte Instance = Byte.valueOf(c);
     System.out.println("here is Byte >> "+Instance);

     
     


    }
}