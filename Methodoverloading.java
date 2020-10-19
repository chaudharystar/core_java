public class Methodoverloading{
	static void foo()
	{
		System.out.println("No argument in method");
	}
	static void foo(int a)
	{
		System.out.println("One argument in method");
	}
	public static void main(String[] args){
		int a=10;
		foo();
		foo(a);
	}
}