//  Write a program to perform below operations on int type to
// get:
// a. The number of bits used to represent a integer value
// b. The number of bytes used to represent a integer value
// c. The minimum value a integer
// d. The maximum value a integer

class Ass1_11{
    public static void main(String[]args)
    {
        System.out.println(" no .of bits >> "+Integer.SIZE);
        System.out.println(" no .of bytes >> "+Integer.BYTES);
        System.out.println(" Min value of integer >> "+Integer.MIN_VALUE);
        System.out.println(" Max value of integer >> "+Integer.MAX_VALUE);
    }
}