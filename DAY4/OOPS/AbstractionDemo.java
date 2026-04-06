package OOPS;
abstract class Shape
{
	public abstract void area(double r);
	
}
class Circle extends Shape{
	public void area(double r)
	{
		System.out.println("AREA OF CIRCE:"+Math.PI*r*r);
	}
}
class Square extends Shape{
	public void area(double r)
	{
		System.out.println("AREA OF SQUARE:"+(r*r));
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Circle cr=new Circle();
   Square sq=new Square();
   cr.area(5.0);
   sq.area(5.0);
   
	}

}
