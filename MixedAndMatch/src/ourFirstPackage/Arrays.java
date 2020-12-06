package ourFirstPackage;

public class Arrays {
	
	
	static int b =100;



	static 
	
	String [] x = new String[10];




	static String [] employeeName = new String [10];
	static int [] employeeId = new int [7];
	static double [] employeeSalary = new double [10];

	static String [][] managerName = new String [5][10];


	static String [][][] test = new String [7][10][100];




	public static void main(String[] args) {
		// we can not assign data type again.Only one time.

		employeeName[1] = "Rakib";
		employeeName[2] = "Haque";
		employeeName[0] = "Luis";

		employeeId[6] = 10;
		employeeSalary[1] = 3000;

		managerName[0][0] = "Rony";
		managerName[3][8]= "Rifa";
		managerName[4][9]= "Imran";
		managerName[4][4]= "Nayan";


		x[8]= "Imran";

		int a = 80;

		System.out.println(a);
		a = 70;

		System.out.println(b);

		System.out.println(employeeName[1]);
		System.out.println(employeeName[2]);
		System.out.println(employeeName[0]);
		System.out.println(employeeId[5]);
		System.out.println(employeeSalary[1]);
		System.out.println(managerName[3][8]);

		secondMethod();
		thirdMethod();

		System.out.println(x[8]);
		System.out.println(managerName[4][4]);

	}

	public static void secondMethod() {

		int a = 90;
		System.out.println(a);

	}

	public static void thirdMethod() {

		int a = 50;
		System.out.println(a);

	}
}

   

