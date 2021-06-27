package lab;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo6 {
	public static void main(String[] args) {
		BadPolitician bp=new BadPolitician();
		PoliceStation police=new PoliceStation();
		police.interrogate(bp);
		police.tortureRoom(bp);
	}
}

class PoliceStation{
	public void interrogate(BadPolitician bp) {
		System.out.println(bp.name);
		bp.legalAsset();
	}
	
	public void tortureRoom(BadPolitician bp) {
		try {
			Class cls=bp.getClass();
			Field f=cls.getDeclaredField("secretName");
			f.setAccessible(true);
			System.out.println(f.get(bp));
			Method met=cls.getDeclaredMethod("illegalAsset");
			Class[] par=met.getParameterTypes();
			met.setAccessible(true);
			met.invoke(bp);
			
			Field ff[]=cls.getDeclaredFields();
			for(Field i:ff) {
				i.setAccessible(true);
				System.out.println(i.getName());
			}
			
			Method mm[]=cls.getDeclaredMethods();
			for(Method method:mm) {
				method.setAccessible(true);
				System.out.println(method.getName());
			}
		}catch(Exception exc) {
			
		}
	}
}

class BadPolitician{
	private String secretName="Secret name";
	public String name="Ragu";
	public void legalAsset(){
		System.out.println("These are my legal assests...");
	}
	
	private void illegalAsset(){
		System.out.println("These are my illegal assets...");
	}
}