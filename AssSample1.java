public class AssSample1 {

//AREA OF CRICLE	
	public void AreaofCircle(int r) 
	{
		double x=3.14*r*r;
		System.out.println("Area of circle: "+x);
	}
	
//AREA OF TRIANGLE	
	public void Areaoftriangle(int height,int breadth) 
	{
		int x=(height*breadth)/2;
		System.out.println("Area of triangle: "+x);
	}
	
//AREA OF SQUARE	
	public void Areaofsquare(int side) 
	{
		int x=side*side;
		System.out.println("Area of square: "+x);
	}
	
//AREA OF RECTANGLE	
	public void Areaofrectangle(int length,int width) 
	{
		int x=width*length;
		System.out.println("Area of rectangle: "+x);
	}
	
//AREA OF CUBE	
	public void AreaofCube(int edge) 
	{
		int x=6*edge*edge;
		System.out.println("Area of cube: "+x);
	}
	

	public static void main(String[] args)
	{
		AssSample1 obj=new AssSample1();
		obj.AreaofCircle(5);
		obj.AreaofCube(4);
		obj.Areaofrectangle(12, 4);
		obj.Areaofsquare(8);
		obj.Areaoftriangle(5, 4);
	}

}
