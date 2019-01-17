import java.util.*;
import java.lang.Math;

class Month
{

public static void main(String args[])
{
   int a,b=0;
   Scanner monh= new Scanner(System.in);
   do
 {
 	System.out.println("enter  num from 1 to 12");
     b=monh.nextInt();
 
     if((b>=1) &&  (b<=12))
   {
     switch(b)
   {
   	  case 1:
   	System.out.println("Its Jan");
   	break;

   	case 2:
   	System.out.println("Its Febr");
   	break;

   	  case 3:
   	  System.out.println("Its Mar");
   	break;

   	case 4:
   	System.out.println("Its Apr");
   	break;

   	   case 5:
   	System.out.println("Its May");
   	 break;

   	case 6:
   	  System.out.println("Its June");
   	break;

   	 case 7:
   	System.out.println("Its July");
   	break;

   	 case 8:
   	System.out.println("Its Aug");
   	break;

   	 case 9:
   	System.out.println("Its Sep");
   	break;

   	case 10:
   	System.out.println("Its Oct");
   	break;  

   	 case 11:
   	System.out.println("Its Nov");
   	break;

   	case 12:
   	System.out.println("Its Dec");
   	  break;
    }
}


  else
  {
	System.out.println("The numb is incorrect");
}

 Scanner ent= new Scanner(System.in);
System.out.println(" you want to continue? 1.yes 2.no? ");
 a=ent.nextInt();

}
   while(a==1);

}
}