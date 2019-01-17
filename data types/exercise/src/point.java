class Point
{ 
public static void main(String args[])
{
	private double  int x1;
	private double int x2;
	private double int y1;
	private double int y2;

	Point()
	{
	System.out.println("nothing");
	}
	Point ( int x1.int x2)
	{
	this.x1=x1;
	this.x2=x2;
	} 
	Point ( int x1, int x2 , int y1, int y2)
	{
	this.x1=x1;
	this.x2=x2;
	this.y1=y1;
	this.y2=y2;
	}
	public double get x1()
	{
	return x1;
	}
	public double get x2;
	{
	return x2;
	}
	public double get y1;
	{
	return y1;
	}
	public double get y2;
	{
	return y2;
	}
	public void set x1(int x1)
	{
	this.x1=x1;
	}
	public void set x2(int x2)
	{
	this.x2=x2;
	}
	public void set y1(int y1)
	{
      this.y1=y1;
      }
      public void set y2(int y2)
      {
      this.y2=y2;
      }
      double Distance (Point P1)
      {
      double dis;
      dis=Math.Sqrt(Math.Pow(getx2()-P1.getx1()),2)+(Math.pow(gety2()-P1.gety1()),2);
      return dis;
      }
      }
     } 