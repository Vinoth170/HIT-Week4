package lab;

import java.util.Scanner;

public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception{
		String name,fname,clsname;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the politician name: ");
		name=scan.nextLine();
		System.out.print("Enter the politician fathername: ");
		fname=scan.nextLine();
		
		System.out.print("Enter the qualified name of politician class: ");
		clsname=scan.nextLine();
		
		Politician p=(Politician)Class.forName("lab.AbcPolitician").getConstructor(String.class,String.class).newInstance(name,fname);
		System.out.println(p);
	}
}

abstract class Politician{
	
}

class AbcPolitician extends Politician{
	
	String name, fname;
	public AbcPolitician(String name, String fname) {
		this.name=name;
		this.fname=fname;
	}
	
	@Override
	public String toString() {
		return "AbcPolitician\n--------------\nName: "+this.name+"\nFather name: "+this.fname;
	}
}

class XysPolitician extends Politician{
	
	String name, fname;
	public XysPolitician(String name, String fname) {
		this.name=name;
		this.fname=fname;
	}
	
	@Override
	public String toString() {
		return "XyzPolitician\n--------------\nName: "+this.name+"\nFather name: "+this.fname;
	}
}