package lab;

import java.util.Scanner;

public class ReflectionDemo1 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the class name of paint with qualified name: ");
		String clsName=scan.next();
		
		Paint paint1=(Paint)Class.forName(clsName).newInstance();//Old method
		
		Paint paint2=(Paint)Class.forName(clsName).getConstructor().newInstance();//Method after jdk 9
		System.out.println("Object created through dynamic way "+clsName);
		
		paint1.doPaint();
		
	}
}

abstract class Paint{
	final void doPaint(){
		System.out.println("Do painting....");
	}
}

class RedPaint extends Paint{
	public RedPaint() {
		System.out.println("Red paint is chosen....");
	}
}

class GreenPaint extends Paint{
	public GreenPaint() {
		System.out.println("Green paint is chosen....");
	}
}