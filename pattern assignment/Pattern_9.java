class  Pattern_9{
	public static void main(String[]args)
	{
		for(char i='a';i<='e';i++)
		{
			
			for(char j='e';j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(char k='a';k<=i;k++)
		  {
			System.out.print(k+" ");
		  }
		  
		 System.out.println();
	    }
		
}
}

/*
     a
    a b
   a b c
  a b c d
 a b c d e
*/
