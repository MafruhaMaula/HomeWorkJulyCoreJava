package hw3JavaVariables;

public class AboutMe {
	public String name1; // variable is declared
	public String name = "Mafruha Maula"; // variable is initialized
	public byte age = 100;
	public short myYearlyHouseRent = 3500;
	public int myYearlySalary = 300000000;
	public long myBankBalance = 800000000l;
	public float myHeight = 5.300f;
	public double myGrade = 4.00000;
	public char sex = 'F';
	public boolean usCitizen = true;

	public static void main(String[] args) {

		// MyInfo class is instantiated
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Name is: " + aboutMe.name + "\nMy Age: " + aboutMe.age + "\nMy HouseRent: "
				+ aboutMe.myYearlyHouseRent + "\nYearly Salary: " + aboutMe.myYearlySalary + "\nMy Bank Balance: "
				+ aboutMe.myBankBalance + "\nSex: " + aboutMe.sex + "\nMy Height: " + aboutMe.myHeight + "\nMy Grade: "
				+ aboutMe.myGrade + "\nAm I US Citizen? Ans: " + aboutMe.usCitizen);

	}
}
