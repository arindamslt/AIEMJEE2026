package OOPS;
class Circles implements Shp
{
	public void area(double r)
	{
		System.out.println("AREA OF CIRCE:"+Math.PI*r*r);
	}
}
class Squares implements Shp
{

	@Override
	public void area(double r) {
		// TODO Auto-generated method stub
		System.out.println("AREA OF SQUARE:"+(r*r));
	}

	
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Circles cr=new Circles();
 Squares sq=new Squares();
 cr.area(10.5);
 sq.area(10.5);
	}

}
