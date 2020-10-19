class Super
{
    int x;
	Super(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("Super x = "+x);
	}
}
class Sub extends Super
{
    int y;
	Sub (int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("Super x = "+x);
		System.out.println("Super y = "+y);
	}
}
class Methodoverriding{
	public static void main(String[] args)
	{
		Sub s2=new Sub(200,300);
		s2.display();
	}
	
}