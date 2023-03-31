 //.Write a program to perform below operations on char type to get:
// a. The number of bits used to represent a char value
// b. The number of bytes used to represent a char value
// c. The minimum value a char
// d. The maximum value a char
class Ass1_6{
    public static void main (String[]args)
    {
        System.out.println("no.of bits :"+Character.SIZE);
        System.out.println("no.of bytes :"+Character.BYTES);
        System.out.println("min value :"+Character.MIN_VALUE);
        System.out.println("max value :"+Character.MAX_VALUE);
    }
}