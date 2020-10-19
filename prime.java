import java.util.Scanner;
public class Prime{
	public static boolean numberis(int num)
	{ int flag=0; 
	for(int i=2;i<num;i++){
		if(num%i==0)
		{
			flag=1;
		    break;
		}
	     }
	   if(flag==0)
			return true;
		else
			return false;
	}
	
    public  static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.printf("Enter number :");
		int num=sc.nextInt();
		Prime a=new Prime();
		if(a.numberis(num))
			System.out.printf("Number is prime");
		else
			System.out.printf("Number is not prime");


		
	}
}