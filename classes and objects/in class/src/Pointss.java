
class Pointss
{ 


	 static private double  x1;
	 static private double  x2;
	 static private double  y1;
	 static private double  y2;

	Pointss ()
	{
	System.out.println("nothing");
	}
	Pointss (int x1,int x2)
	{
	this.x1=x1;
	this.x2=x2;
	} 
	Pointss( int x1, int x2 , int y1, int y2)
	{
	this.x1=x1;
	this.x2=x2;
	this.y1=y1;
	this.y2=y2;
	}
	static public double getx1()
	{
	return x1;
	}
	static public double getx2()
	{
	return x2;
	}
	 static public double gety1()
	{
	return y1;
	}
	static public double gety2()
	{
	return y2;
	}
	 public void setx1(int x1)
	{
	this.x1=x1;
	}
	public void setx2(int x2)
	{
	this.x2=x2;
	}
	public void sety1(int y1)
	{
      this.y1=y1;
      }
      public void sety2(int y2)
      {
      this.y2=y2;
      }
      static double Distance (Pointss P1, Pointss P2)
      {
      double dis;
      dis=Math.sqrt(Math.pow((P2.getx2()-P1.getx1()),2)+(Math.pow((P2.gety2()-P1.gety1()),2)));
      return dis;
      }
      }
 