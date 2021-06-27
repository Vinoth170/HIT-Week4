package lab;

public class InterfaceDemo {
	public static void main(String[] args) {
		Hospital abc=new HomeopathyHospital();
		Doctor doctor=(Doctor)abc;
		doctor.doService();
		doctor.diagnose();
		System.out.println("Doctor has "+Doctor.steth);
		Nurse nurse=(Nurse)abc;
		nurse.doNursing();
	}
}

interface Doctor{//Every methods in interface is always in abstract form
	String steth="Stethoscope";//This is same as final static String steth="Stethoscope";
	//Fields in interface are always static and final ie) fields are constant and available in memory
	
	public void doService();
	
	default void diagnose() {//default method is introduced from jdk 9
		System.out.println("Doctor diagnose the patient's sick...");
	}
}

interface Nurse{
	public void doNursing();
}

interface Hospital extends Doctor,Nurse{
	String rooms="Rooms will be there";
}

class AllopathyHospital implements Hospital{
	@Override
	public void doService() {
		System.out.println("Services will be provided as per Allopathy way...");
	}
	
	@Override
	public void doNursing() {
		System.out.println("Nurse support Allopathy doctor...");
	}
}

class HomeopathyHospital implements Hospital{
	@Override
	public void doService() {
		System.out.println("Services will be provided as per Homeopathy way...");
	}
	
	@Override
	public void doNursing() {
		System.out.println("Nurse support Homeopathy doctor...");
	}
}