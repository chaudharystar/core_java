//string valid or invalid
import java.util.Scanner;
public class MyClass {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.printf("enter string :");
    String s =sc.next();
	int flag=0;
	for(int i=0;i<txt.length();i++)
	{
		if(!(s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')) 
			flag=1;
		    break;
	}
	if(flag==0)
		System.out.println("String is valid");
	else
		System.out.println("String is invalid");
  }
}
