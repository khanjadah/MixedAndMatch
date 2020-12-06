package accessModifier;

public class RunnerClass {
	
	/* Access modifier = This is the way ,how could we access our code .
	 * There are 4  access modifier--
	 * Public:- All code are accessable by any package.
	 * Protected:- All code can be access within the class,  within the same package, and sub classes.
	 * Private:-Code can only be access within the class.Private code access by getter and setter method.
	 * Default:-When we leave it blank , it takes default.it can only access within the class and package.Not by Subclasses.
	*/

	public static void main(String[] args) {
		
		Protected p = new Protected();
		Default d = new Default();
		//Private pv = new Private();
		
		
//		Protected.start();
//		System.out.println(p.name);
		Default.start();
		System.out.println(d.name);
		System.out.println(Default.lastName);
		
		System.out.println(Private.getBodyParts());
		
		
		Private.setBodyParts("arm");
		System.out.println(Private.getBodyParts());
		
		
	}

}
