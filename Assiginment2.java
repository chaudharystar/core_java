//even odd program
import java.util.Scanner;
enum Digit{EVEN,ODD}
public class Assiginment2{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.printf("enter number :");
		int a=sc.nextInt();
		Digit m;
		if(a%2==0)
			m=Digit.EVEN;
		else
			m=Digit.ODD;
		switch(m)
		{
			case EVEN:
			    System.out.println(Digit.valueOf("EVEN"));
				break;
			case ODD:
			    System.out.println(Digit.valueOf("ODD"));
		        break;
		
			}
}
}