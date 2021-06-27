package lab;

import java.util.Scanner;

import java.lang.reflect.Method;

public class ReflectionDemo4{
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		HolyMan holy=new HolyMan();
		Class c=holy.getClass();
		String methodName=scan.next();
		Method m=c.getMethod(methodName,String.class,int.class);
		m.invoke(holy,"Hari",3000);
		
		m=c.getMethod("doService",null);
		m.invoke(holy, null);
	}
}

class HolyMan{
	public void doService() {
		System.out.println("I do social services....");
	}
	
	public void doPreach() {
		System.out.println("I preach personality development....");
	}
	
	public void raiseFund(int money) {
		System.out.println("Money Collected for fund: "+money);
	}
	
	public void register(String name, int fees) {
		System.out.printf("Name: %s\nFees: %d\n", name, fees);
	}
}