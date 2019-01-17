class Distance
{
float feet, inch,feet1,inch1;

Distance ()
{
	System.out.println("nothing");
} 
Distance( float feet,float feet1,float inch1, float inch)
{
	this.feet=feet;
	this.inch=inch;
	this.feet1=feet1;
	this.inch1=inch1;
}
float getfeet()
{
	return feet;
}
float getinch()
{
	return inch;
}
float getfeet1()
{
	return feet1;
}
float getinch1()
{
	return inch1;
}
public void set(float feet,float inch)
{
	this.feet=feet;
	this.inch=inch;
  }
public void set ( float feet , float inch, float feet1, float inch1)
{
	this.feet=feet;
    this.feet1=feet1;
    this.inch=inch;
    this.inch1=inch1;
  }
public void sum (Distance D)
{ float f1, float I1;
	f1=getfeet()+ D.getfeet1();
	I1=getinch()+ D.getinch1();
	System.out.println(f1+ I1);
}

}
