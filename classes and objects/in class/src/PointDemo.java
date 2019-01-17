class PointDemo
{
	public static void main (String args[])
	{
	Pointss p4= new Pointss(4,6);	
	Pointss P2= new Pointss(3,2);
	Pointss P3=new Pointss(11,5,3,3);
	double d1;
	/* P2.setx1(5);
	P2.sety1(7);
	P3.setx2(9);
	P3.sety2(10); */
	d1=P3.Distance(P2);
	System.out.println(d1);
	}
}