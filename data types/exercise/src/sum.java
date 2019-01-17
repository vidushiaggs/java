import java.util.*;
class Sum 
{

    public static void main(String[] args) 
    {
        int num1,num2,diff,multi,remaind;
        float divide;

          Scanner  number = new Scanner(System.in);

        System.out.print("Enter a number: ");
          num1= number.nextInt();
    System.out.println("Enter a second number: ");
         num2 = number.nextInt();
        
           int sum1;

         sum1= num1 + num2;
          diff= num1-num2 ;
    multi= num1*num2;
         divide=num1/num2;
          remaind=num1%num2;


     System.out.println("sum  " + sum1);
       System.out.println("diff is " + diff);
System.out.println("quot is " + divide); 
 System.out.println("multi is " + multi);
     System.out.println("remainder " + remaind);
}
}