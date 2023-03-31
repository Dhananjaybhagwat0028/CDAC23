// Write a program to convert:
// a. long value into String
// b. long value into Long instance.
// c. String instance into Long instance.
// d. long value into binary, octal and hexadecimal string.
class Ass1_16{
    public static void main(String [] args)
    {
         long var = 4143L;
       
         String str =Long.toString(var);
         System.out.println("string is >> "+str);

         Long var2 = Long.valueOf(var);
         System.out.println("long instance is >> "+var2 +" "+ var );
          
         String strNum = "123456";
         Long parseLong = Long.parseLong(strNum); 
         System.out.println("string instance is >> "+ parseLong +" "+ strNum);

         //d. long value into binary, octal and hexadecimal string.
         String st=Long.toBinaryString(var);
         System.out.println(st);  

         String st1=Long.toOctalString(var);
         System.out.println(st1);  

         String st2=Long.toHexString(var);
         System.out.println(st2);

    }
}