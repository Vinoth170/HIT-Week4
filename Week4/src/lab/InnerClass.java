package lab;

public class InnerClass {
	public static void main(String[] args) {
		Kali kali=new Kali();
		kali.sellCola();
		
		Pepsi pepsi=new Pepsi();
		pepsi.sellCola();
	}
}

//Merging
interface Cola{
	public void makeCola();
}

class Pepsi{
	public void sellCola() {
		System.out.println("Pepsi fills campa cola in Pepsi bottle and sell it...");
	}
}

class Kali{
	public void sellCola() {
/*
 * 		//Anonymous inner class
		new Cola() {
			
			@Override
			public void makeCola() {
				System.out.println("Campa cola is made...");
				
			}
		}.makeCola();
		
		//Method Expression
		Cola cc=new Kali()::makeCola;
		cc.makeCola();
*/		
		//Lambda
		Cola cc=()->{System.out.println("Cola made using lambda...");};
		cc.makeCola();
		
		System.out.println("Kali fills campa cola in Kali bottle and sell it...");
	}
	
	private void makeCola() {
		System.out.println("Cola is made by campa cola formula...");
	}
}


/*
 *Acquisition 
 *
interface Cola{
	public void makeCola();
}

//class CampaCola implements Cola{
//	@Override
//	public void makeCola() {
//		System.out.println("Cola made by campa cola...");
//	}
//}

class Pepsi{
	public void sellCola(){
//		CampaCola cc=new CampaCola();
		
//To use acquired class we need to instantiate the upper class
//		Kali.CampaCola cc=new Kali().new CampaCola();
//		Cola cc=new Kali().thief();//To access a private inner class injecting a thief
//		cc.makeCola();
		System.out.println("Pepsi fills campa cola in Pepsi bottle and sell it...");
	}
}

class Kali{
	public void sellCola(){
		class CampaCola implements Cola{//Local inner class - a class within a method-One kind of Merging
			@Override
			public void makeCola() {
				System.out.println("Cola made by campa cola...");
			}
		}
		CampaCola cc=new CampaCola();
		cc.makeCola();
		System.out.println("Kali fills campa cola in Kali bottle and sell it...");
	}
	
//	public Cola thief() {//When private inner class
//		return new CampaCola();
//	}
//	class CampaCola implements Cola{//Acquisition - Inner class
//		@Override
//		public void makeCola() {
//			System.out.println("Cola made by campa cola...");
//		}
//	}
//	private class CampaCola implements Cola{//Private acquisition
//		@Override
//		public void makeCola() {
//			System.out.println("Cola made by campa cola...");
//		}
//	}
}
*/