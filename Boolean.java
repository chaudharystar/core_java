import java.util.Scanner;
public class Boolean{
	public static boolean ageis(int age)
	{
		if(age>=18&&age<=21)
			return true;
		else
			return false;
	}
    public  static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.printf("Enter age :");
		int age=sc.nextInt();
		Boolean a=new Boolean();
		if(a.ageis(age))
			System.out.printf("Your age is between 18 to 21.");
		else
			System.out.printf("Your age is not between 18 to 21.");


		
	}
}