package ourFirstPackage;

import ourSecondPackage.ImportPracticeTwo;


public class OurMainMethod {

	public static void main(String[] args) {

		//create object
		ImportPractice ip = new ImportPractice();
		ImportPracticeTwo ip2 = new ImportPracticeTwo();

		//static way
		ImportPractice.write();
		//ImportPracticeTwo.read();
		ourSecondPackage.ImportPracticeTwo.read();
		ImportPractice.thisMethod();
		ImportPracticeTwo.print2();

		//non static way 
		ip.secondMethod();
		ip2.print3();




	}



}
