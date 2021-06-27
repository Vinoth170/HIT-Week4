package lab;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		_3D cuboid=(a,b,c)->{
			return(a*b*c);
		};
		
		int result=cuboid.area(9, 3, 4);
		
		System.out.println("Area of the cuboid: "+result);
	}
}

interface _3D{
	public int area(int a, int b, int c);
}