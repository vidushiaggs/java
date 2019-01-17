import java.util.*;

 class Fivedigits
 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("input five digits no: ");
          int n = scan.nextInt();

        for(; ;)
        {
            if (n < 10000 || n> 99999) 
            {
                System.out.println("The e number is not  5 digit no. Redo : ");
                n = scan.nextInt();
            } 
            else
                break;
        }

         System.out.printf("%d   ", (n / 10000));
         System.out.printf("%d   ", (n / 1000) % 10);
         System.out.printf("%d   ", (n / 100) % 10);
         System.out.printf("%d   ", (n % 100) / 10);
         System.out.printf("%d   ", (n % 10));
    }
}
