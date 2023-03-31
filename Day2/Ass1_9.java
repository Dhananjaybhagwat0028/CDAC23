// .Write a program to convert:
// a. short value into String
// b. short value into Short instance.
// c. String instance into Short instance.

class Ass1_9{
    public static void main(String[] args)
    {
        short sh = 342;
        String str = Short.toString(sh);
        System.out.println("string is :"+str);

        Short ch =  Short.valueOf(str);
        System.out.println("instace of Short >>"+ch);


    }
}