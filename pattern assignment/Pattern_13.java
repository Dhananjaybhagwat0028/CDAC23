class  Pattern_13{
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
			System.out.print(i+" ");
		  }
		  
		 System.out.println();
	    }
		
}
}

/*
     a
    b b
   c c c
  d d d d
 e e e e e
 
*/
