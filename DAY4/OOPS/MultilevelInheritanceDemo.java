package OOPS;
class Student
{
	public int rollno=1;
	public String sname="ARUP";
	public void show()
	{
		System.out.println("ROLLNO:"+rollno);
		System.out.println("NAME:"+sname);
	}
}
class Exam extends Student
{
	public String sub1="PHYS";
	public String sub2="CHEM";
	public String sub3="MATH";
	public void display()
	{
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}
	public int score(int p,int c,int m)
	{
		return (p+c+m);
	}
}
class PersonalInfo extends Exam{
	public String deptnm="CSE";
	public String sem="IVTH";
	public String phno="8445458";
	public void info()
	{
		System.out.println("DEPARTMENT:"+deptnm);
		System.out.println("SEMESTER:"+sem);
		System.out.println("PHONE NO:"+phno);
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PersonalInfo ps=new PersonalInfo();
  ps.show();
  ps.display();
  int res=ps.score(70,80,90);
  System.out.println("SCORE IS:"+res);
  ps.info();
  
	}

}
