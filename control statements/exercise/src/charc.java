import java.util.Scanner;
class Charc
{ 
public static void main (String args[])
int y=0;
Scanner input=new Scanner(System.in);
System.out.println( "Enter charc");
char ch= input.next( ).charAt(0);
switch(ch)
{
	case 'a':
	case 'i':
	case 'e':
	case 'o':
	case 'u':
	case 'A':
	case'E':
    case 'I':
    case'O':
    case 'U':
    y++;
    }
    if (y==1)
    System.out.println("Enetred charc" + ch + "is vowel");
    else
    if ( (ch>='a'&& ch<='z')||(ch<='A'&& ch<='Z'))
    System.out.println("charc enetred"+ ch+ " is consonant");
    else
    System.out.print("Not an alphabet");

	}
}