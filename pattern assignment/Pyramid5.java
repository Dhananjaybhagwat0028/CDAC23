import java.util.*;
class Pyramid5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows required : ");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-i;k<n;k++)
			{
				System.out.print(k+" ");
			}
			for(int k=n;k>=n-i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*
if i/p is 9

                   9
                  8 9 8
                7 8 9 8 7
              6 7 8 9 8 7 6
            5 6 7 8 9 8 7 6 5
          4 5 6 7 8 9 8 7 6 5 4
        3 4 5 6 7 8 9 8 7 6 5 4 3
      2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
    1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/