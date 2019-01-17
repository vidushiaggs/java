import java.util.Scanner;
class Rhombus
{
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter rows");
	int nr = s.nextInt();
		int c1 = 1;
		int c2 = 1;
		char c ='A';

		for (int a = 1; a <(nr*2); a++)
		{
		for(int sp= nr - c2; sp> 0; sp--)
		{
			System.out.print(" ");
		}
		if (a<nr)
		{
		c2++;
		}
		else {
		c2--;
		}
		for (int j = 0; j< c1; j++)
		{
		System.out.print(c);
		if (j<c1/2)
		{
		c++;
		} else
		{
		c--;
		}
		if ( a<nr)
		{
	c1 = c1+2;
		}
		else 
		{ 
		c1= c1-2;
		}
		c= 'A';
		System.out.println();
		
		}
		}
}
}