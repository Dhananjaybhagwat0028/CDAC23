class  Pattern_10{
	public static void main(String[]args)
	{
		for(char i='e';i>='a';i--)
		{
			
			for(char j=i;j>='a';j--)
			{
				System.out.print(" ");
			}
			
			for(char k='e';k>=i;k--)
		  {
			System.out.print(k+" ");
		  }
		  
		 System.out.println();
	    }
		
}
}

/*
     e
    e d
   e d c
  e d c b
 e d c b a

*/