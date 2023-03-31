// Write a program to perform below operations on short type to
// get:
// a. The number of bits used to represent a short value
// b. The number of bytes used to represent a short value
// c. The minimum value a short
// d. The maximum value a short


class Ass1_8{
    public static void main (String[]args)
    {
        System.out.println("no.of bits :"+Short.SIZE);
        System.out.println("no.of bytes :"+Short.BYTES);
        System.out.println("min value :"+Short.MIN_VALUE);
        System.out.println("max value :"+Short.MAX_VALUE);
    }
}