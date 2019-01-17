import java.util.*;
class Series
{
	public static void main(String[] args)
	{
int a,b,mul=1,t=1,x;
Scanner entries = new Scanner(System.in);
System.out.println("Enter");
x= entries.nextInt();
System.out.println("Enter value for y");
b= entries.nextInt();

for (a=1; a <= b; a++)
{
t = t + mul / a;
mul= mul * x;
	}
	System.out.print("the sum equals" +t);
}
}