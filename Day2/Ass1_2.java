class Ass1_2{
    public static void main(String[] args) {
        //method 1   boolean value into String
     boolean  b = true;
     String str = String.valueOf(b);
     System.out.println("string is "+str);

     //method 2
     boolean  a = false;
     String str1 = Boolean.toString(a);
     System.out.println("string is "+str1);




     //que2 .boolean value into Boolean instance 
     boolean c = true;
     Boolean Instance = Boolean.valueOf(c);
     System.out.println("here is Boolean "+c);



     //que3 . String value into boolean value
     String str2 = "abc";
     boolean d =  Boolean.parseBoolean(str2);
     System.out.println("string to Boolean >> "+d);



     //que 4. String value into Boolean instance. 
     String str3 = "abcde";
     Boolean instance1 = Boolean.valueOf(str3);
     System.out.println("string into Boolean instance >> "+str3);



    }
}
