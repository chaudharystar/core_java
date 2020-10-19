//string to character array
import java.util.Scanner;
public class Assiginment1{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.printf("enter string :");
		String s=sc.nextLine();
		char[] a=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			a[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++){
		System.out.printf("%c ",a[i]);}
	}
}