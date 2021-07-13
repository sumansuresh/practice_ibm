public class AssSample1 {

//AREA OF CRICLE	
	public void areaofCircle(int r) 
	{
		double x=3.14*r*r;
		System.out.println("Area of circle: "+x);
	}
	
//AREA OF TRIANGLE	
	public void areaoftriangle(int height,int breadth) 
	{
		int x=(height*breadth)/2;
		System.out.println("Area of triangle: "+x);
	}
	
//AREA OF SQUARE	
	public void areaofsquare(int side) 
	{
		int x=side*side;
		System.out.println("Area of square: "+x);
	}
	
//AREA OF RECTANGLE	
	public void areaofrectangle(int length,int width) 
	{
		int x=width*length;
		System.out.println("Area of rectangle: "+x);
	}
	
//AREA OF CUBE	
	public void areaofCube(int edge) 
	{
		int x=6*edge*edge;
		System.out.println("Area of cube: "+x);
	}
	

	public static void main(String[] args)
	{
		AssSample1 obj=new AssSample1();
		obj.areaofCircle(5);
		obj.areaofCube(4);
		obj.areaofrectangle(12, 4);
		obj.areaofsquare(8);
		obj.areaoftriangle(5, 4);
	}

}
