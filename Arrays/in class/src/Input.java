import java.util.Scanner;

class Input

{

	public static void main(String args[])

	{

		int m, n, j, i;
		Scanner scan = new Scanner(System.in); 
		int ar[] = new int [5];
		System.out.println("Enter five numbers from 10 to 100 )");
		for ( i = 0; i < 5;)

		{

			m = scan.nextInt();

			if (m < 10 || m > 100)

				{

					System.out.println("The entered number is invalid.");

			        continue;

			    }    

			else

			    {

				    ar[i] = m;

			     	i++;

			    }
		}	

		for (n = 0; n < 5; n++)

		{

			for (j = 0; j < n; )

			if (ar[j] == ar[n])

				{

					j++;

				}

			else 

			    {

				System.out.println(ar[j]);

				j++;

			    }	

 

		}



	}

}