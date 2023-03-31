// Write a program to convert:
// a. int value into String
// b. int value into Integer instance.
// c. String instance into Integer instance.
// d. int value into binary, octal and hexadecimal string.
class Ass1_12{
    public static void main(String [] args)
    {
         int var = 4143;
       
         String str = Integer.toString(var);
         System.out.println("string is >> "+str);

         Integer var2 = Integer.valueOf(var);
         System.out.println("inteder instance is >> "+var2);
          
         String strNum = "12345";
         Integer parsedInt = Integer.parseInt(strNum); 
         System.out.println("inteder instance is >> "+parsedInt+" "+strNum);

         //d. int value into binary, octal and hexadecimal string.
         String st=Integer.toBinaryString(var);
         System.out.println(st);  

         String st1=Integer.toOctalString(var);
         System.out.println(st1);  

         String st2=Integer.toHexString(var);
         System.out.println(st2);







    }
}