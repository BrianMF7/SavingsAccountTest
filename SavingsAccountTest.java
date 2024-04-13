
public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		System.out.println("Starting Balance before interest applied of 4% " + "Savings Account 1: " + "$" + saver1.getSavings());
		System.out.println("Starting Balance before interest applied of 4% " + "Savings Account 2: " + "$" + saver2.getSavings());

		for(int i = 1; i <= 12; i++) { //In 12 months
			SavingsAccount.modifyInterestRate(0.04);
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.println("Month " + i + ": " + " Savings Account 1 Balance: $" + saver1.getSavings() 
            + ", Savings Account 2 Balance: $" + saver2.getSavings()); //add i to it so next month adds to it
			
		}
		
		//Next month but with 5%
		System.out.println("Now for the next month, a 5% interest rate has to been changed.");
		SavingsAccount.modifyInterestRate(0.05); 

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Next Month, Savings Account 1 Balance: $" + saver1.getSavings()
                + ", Savings Account 2 Balance: $" + saver2.getSavings());
    }
		
			}
