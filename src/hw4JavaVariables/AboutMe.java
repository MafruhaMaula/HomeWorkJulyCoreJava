package hw4JavaVariables;

public class AboutMe {
	
	public String name; //variable is declared
	public byte age;
	public short myYearlyHouseRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;
	
	public AboutMe() { //Constructor declared
		System.out.println("This is all about us:");
	}
	public void aboutMe() { //method is implemented
	    System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nYearlyHouseRent: " + myYearlyHouseRent
					+ "\nmyYearlySalary:" + myYearlySalary + "\nMy Bank Balance is: " + myBankBalance + "\nMy Height is: "
					+ myHeight + "\nMy Grade is: " + myGrade + "\nSex: " + sex + "\nAm I US Citizen? Ans: " + usCitizen);
    }
}
