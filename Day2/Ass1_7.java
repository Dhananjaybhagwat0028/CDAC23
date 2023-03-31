
// Accept character from command line and perform below
// operations. Here you can use charAt() method to extract
// character:

// a. Check whether entered character is letter or digit. If it is digit then print its values as well as code point.
// b. If it is character then check whether it is in lowercase? If it is in lowercase then convert it into upper case and
// print it well as its code point. If it is in uppercase then convert it into lower case and print it well as its code point.


class Ass1_7{
    public static void main(String[]args)
    {
        System.out.println("enter any char input :");
        char ch = args [0].charAt(0);
        if(Character.isDigit(ch))
        {
            System.out.println("char is digit :"+ch); 
            //a code point, codepoint or code position is a numerical value that maps to a specific character
            System.out.println("codepoint :"+(int)ch); 
        }
        else if(Character.isLetter(ch))
        {
            if(Character.isLowerCase(ch))
            {
                char upperch = Character.toUpperCase(ch);
                System.out.println("letter is in lowercase:"); 
                System.out.println("in uppercase :"+upperch ); 
                System.out.println("codepoint :"+(int)upperch);

            }
            else
            {
                char lowerch = Character.toLowerCase(ch);
                System.out.println("letter is in uppercase:"); 
                System.out.println(" in lowercase :"+lowerch ); 
                System.out.println("codepoint :"+(int)lowerch);

            }


        }
        else
        {
            System.out.println("The entered character is not a letter or a digit.");
        }


    }
}