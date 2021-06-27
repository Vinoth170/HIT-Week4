package lab;

import java.lang.reflect.Field;

public class ReflectionDemo5 {
	public static void main(String[] args) throws Exception{
		Employee std=new Employee();
		Class c=std.getClass();
		Field f=c.getField("name");
		f.set(std, "Kumar");
		System.out.println(f.get(std));
	}
}

class Employee{
	public String name;
	public int age;
}
