public class Student_id{
 int roll_no;
 String name;
 String address;
 char section; 
 Student_id(int roll_no1,String name1,String address1)
 {
	 this.roll_no=roll_no1;
	 this.name=name1;
	 this.address=address1;
 }
 Student_id(int roll_no1,String name1,String address1,char section1)
 {
	 this.roll_no=roll_no1;
	 this.name=name1;
	 this.address=address1;
	 this.section=section1;
 }
 public void display()
 {
	 System.out.println("Roll number is :" +roll_no);
	 System.out.println("Name is :" +name);
	 System.out.println("Address is :" +address);
	 System.out.println("Section is :" +section);
 }
 public static void main(String[] args){
	 Student_id s1=new Student_id(1,"Sandeep","balrampur",'A');
	 Student_id s2=new Student_id(2,"Kumar","Banaras");
	 s1.display();
	 s2.display();
 }
}
