package lab;

import java.util.Scanner;

public class ReflectionDemo3 {
	public static void main(String[] args) throws Exception{
		System.out.println("Enter the qualified name of the class: ");
		String clsName=new Scanner(System.in).next();
		
		Student std1=(Student)Class.forName(clsName).getDeclaredConstructor().newInstance();
		System.out.println(std1);
		
		Student std2=(Student)Class.forName(clsName).getDeclaredConstructor(String.class).newInstance("Krishna");
		System.out.println(std2);
	}
}

abstract class Student{
	
}

class ITStudent extends Student{
	ITStudent() {
		
	}
	protected ITStudent(String s){
		System.out.println(s);
	}
}