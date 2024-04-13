public class SavingsAccount {
	private static double annualInterestRate; //Static as said in homework
	private double savingsBalance;
	
	
	public SavingsAccount(double savingsBalance){
	this.savingsBalance = savingsBalance;
}


	public void calculateMonthlyInterest() {
		double monthlyInterest = (annualInterestRate * savingsBalance) /12; //12 months in a year
		savingsBalance += monthlyInterest; //repeats
		
	}
	
	public static void modifyInterestRate(double newValue) {
		annualInterestRate = newValue; 
	}
	
	public double getSavings() {
		return savingsBalance;
	}
	
}
