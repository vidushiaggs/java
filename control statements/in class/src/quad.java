import java.util.Scanner;
import java.lang.Math;
class Quad
{
	public static void main(String args[])
	{int a,b,c;
	double d, root1,root2;
	
	Scanner w =new Scanner(System.in);
	System.out.println(" input a");
	a= w.nextInt();
	b= w.nextInt();
	c= w.nextInt();
	d= (b*b) -( 4*a*c);

	if (d >= 0)
	{
	System.out.print("the sum has real or unreal roots");
	root1 = (-b + (Math.sqrt(d)))/(2*a);
	root2 = (-b - (Math.sqrt(d)))/(2+a);
	System.out.println("root1 is" +root1);
	System.out.println("root2 is" +root2);
	}
	if (d < 0)
	{ 
	System.out.println(" root does not exist");

	}
}


}
