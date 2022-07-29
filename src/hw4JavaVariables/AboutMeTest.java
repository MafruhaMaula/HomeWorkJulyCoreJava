package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		// class is instantiated
		AboutMe me1 = new AboutMe(); // Constructor is initialized
		
		me1.name = "Mafruha Maula"; // variable is initialized
		me1.age = 100;
		me1.myYearlyHouseRent = 4500;
		me1.myYearlySalary = 300000;
		me1.myBankBalance = 40000000l;
		me1.myHeight = 6.5300f;
		me1.myGrade = 4.0000;
		me1.sex = 'F';
		me1.usCitizen = true;
		me1.aboutMe(); // method initialized
		
		System.out.println("\n####################\n");

		AboutMe myfrd = new AboutMe(); // Constructor is initialized
		myfrd.name = "Alex"; // variable is initialized
		myfrd.age = 90;
		myfrd.myYearlyHouseRent = 6500;
		myfrd.myYearlySalary = 200000;
		myfrd.myBankBalance = 70000000l;
		myfrd.myHeight = 3.5200f;
		myfrd.myGrade = 3.5000;
		myfrd.sex = 'M';
		myfrd.usCitizen = true;
		myfrd.aboutMe(); // method initialized
	}
}
