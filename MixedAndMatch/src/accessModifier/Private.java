package accessModifier;

public class Private {
	
	
	private static String job = "Pilot";
	private  static String  bodyParts = "Hand";
	public static String carParts="Wheels";
	
	
	private static String food;

	public static void main(String[] args) {
		
		job ="Lawer";
		
		print();
     System.out.println(job);
     System.out.println(bodyParts);
	}

	private static void print() {
		
		System.out.println("My job is print something");
		
	}

	
	public static String getBodyParts() {
		return bodyParts;
	}

	public static void setBodyParts(String bodyParts) {
		Private.bodyParts = bodyParts;
	}

	
	
}
