class Star5{

	public static void main(String args[])
	{			
		for(int i=1;i<=4;i++)//row
		{
			for(int j=4;j>=i;j--)//spaces
			{
				System.out.print("  ");
			}
				
			for(int k=1;k<=i;k++)//1st triangle
			{
				System.out.print("* ");
			}
          
			for(int k1=1;k1<i;k1++)//2nd triangle
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
			
			
			
		
		
		
		
	}
	
}

/*
        *
      * * *
    * * * * *
  * * * * * * *
*/