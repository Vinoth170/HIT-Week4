package lab;

import java.lang.reflect.Method;

public class ParameterDemo {
	public static void main(String[] args){
		Demo1 d1=new Demo1();
		try {
			Class cls=d1.getClass();
			Method met[]=cls.getDeclaredMethods();
			
			Method met1=cls.getDeclaredMethod("met1", String.class,String.class);
			met1.setAccessible(true);
			met1.invoke(d1, "hi","hello");
			
			for(Method m:met) {
				System.out.println(m.getName());
				Class par[]=m.getParameterTypes();
				for(Class p:par) {
					System.out.println(p);
				}
			}
		}catch(Exception exc) {
			System.out.println(exc);
		}
	}
}


class Demo1{
	public void met1(){
		
	}
	
	private void met1(String str1,String str2) {
		
	}
	
	public void met2(String i) {
		System.out.println(i);
	}
}

class Demo2{
	public void met2(int i) {
		
	}
	
	public void met2(int i,String str) {
		
	}
	
	public void met2(int i,String str,boolean k) {
		
	}
}