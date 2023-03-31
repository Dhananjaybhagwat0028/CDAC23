// Write a program to convert:
// a. float value into String
// b. float value into Float instance.
// c. String instance into Float instance.
// d. float value into hexadecimal string.
class Ass1_20{
    public static void main(String [] args)
    {
         float var = 4143f;
       
         String str =Float.toString(var);
         System.out.println("string is >> "+str);

         Float var2 = Float.valueOf(var);
         System.out.println("Float instance is >> "+var2 +" "+ var );
          
         String strNum = "123456";
         Float parseFloat = Float.parseFloat(strNum); 
         System.out.println("string instance is >> "+ parseFloat +" "+ strNum);

         //d. Float value into  hexadecimal string.
         
         String st2=Float.toHexString(var);
         System.out.println(st2);

    }
}