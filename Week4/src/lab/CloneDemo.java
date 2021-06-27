package lab;

public class CloneDemo {
	public static void main(String[] args) {
		Sheep mother=new Sheep();
		mother.name="I'm mother sheep";
		
		Sheep dolly=mother.createClone();
		dolly.name="I'm the clone dolly";
		
		System.out.println(mother.name+"\n"+dolly.name);
	}
}

class Sheep implements Cloneable{
	public String name;
	
	public Sheep() {
		System.out.println("Sheep object is created...");
	}
	
	public Sheep createClone() {
		try {
			return (Sheep)super.clone();
		}catch(CloneNotSupportedException exc) {
			exc.printStackTrace();
			return null;
		}
	}
}