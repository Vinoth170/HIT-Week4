package lab;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Teacher teacher=InterfaceDemo2::tamil;//for static methods we don't need to instantiate
		teacher.doLecture();
		
		teacher=new InterfaceDemo2()::maths;//for non-static methods we need to instantiate
		teacher.doLecture();
	}
	
	public void maths() {
		System.out.println("I'm your maths teacher. I will take Maths...");
	}
	
	public static void tamil() {
		System.out.println("I'm your Tamil teacher. I will take your language class...");
	}
}

interface Teacher{//This interface is known as functional interface, since it has one method.
	public void doLecture();
}