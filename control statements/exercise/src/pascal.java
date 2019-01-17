import java.util.Scanner;
class Pascal
{
	public static void main(String args[])
	{
	System.out.println("Enter the no of rows to print");
	Scanner r = new Scanner (System.in);
	int rows = r.nextInt();
	for( int x = 0; x< rows; x++)
	{
	int number= 1;
	System.out.format("%"+(rows-x)*2+"r","");
	for(int j = 0; j<= x; j++) 
	{ 
	System.out.format("%4d",number);
    number = number * ( x-j)/ (j+1);
    }
    System.out.println();
	}
	}
}