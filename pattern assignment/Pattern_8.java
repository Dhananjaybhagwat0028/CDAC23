class  Pattern_8{
	public static void main(String[]args)
	{
		for(int i=5;i>=1;i--)
		{
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>=i;k--)
		  {
			System.out.print(k+" ");
		  }
		  
		 System.out.println();
	    }
		
}
}

/*
     5
    5 4
   5 4 3
  5 4 3 2
 5 4 3 2 1
*/