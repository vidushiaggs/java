import java.util.*;
public class Decimal{
  public static void main(String args[])

{
	 Scanner input= new Scanner (System.in);
	 System.out.print("Enter 1st no");
double num1 = input.nextDouble();
System.out.print("enter 2nd no");
double num2 = input.nextDouble();
num1= num1*1000;
num2= num2*1000;
if(num1==num2)
System.out.println("two no are equal upto 3 places");
else
System.out.println("two no are not equal upto 3 places");
}
}