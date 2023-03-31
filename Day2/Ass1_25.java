// Write a program to convert:
// a. double value into String
// b. double value into Double instance.
// c. String instance into Double instance.
// d. double value into binary, octal and hexadecimal
// string(Note: Here you can use doubleToLongBits() method
// along with methods ofDouble class).
class Ass1_25{
    public static void main(String [] args)
    {
         double var = 4143d;
       
         String str =Double.toString(var);
         System.out.println("string is >> "+str);

         Double var2 =Double.valueOf(var);
         System.out.println("double instance is >> "+var2 +" "+ var );
          
         String strNum = "123456";
         Double parseDouble =Double.parseDouble(strNum); 
         System.out.println("string instance is >> "+ parseDouble +" "+ strNum);

         //d. double value into binary, octal and hexadecimal string.

         double d = 12.5;// intiliaze 
          String ls=Long.toBinaryString(Double.	doubleToLongBits(d));
         System.out.println(ls);// printing
         String lo= Long.toOctalString(Double.	doubleToLongBits(d));
         System.out.println(lo);// printing
         String str2 =Double.toHexString(d);
          System.out.println(str2);  

    }
}