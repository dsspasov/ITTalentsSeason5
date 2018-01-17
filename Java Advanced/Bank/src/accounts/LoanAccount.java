package accounts;

public class LoanAccount extends Account{

	private double totalTax;
	
	public enum LoanType{
		HomeCredit,
		ConsumerCredit
	}
	
	public LoanAccount(String name, double yearlyInterest, int periodOfTime, double money) {
		super(name, yearlyInterest, periodOfTime, money);
		this.totalTax  = calculateLoanTax(money, yearlyInterest, periodOfTime);
	}

	public double getMonthlyFee() {
		return this.totalTax/super.periodOfTime;
	}
	
	private static double calculateLoanTax(double money, double percentage, int time){
		return money*(1 + percentage/12*time);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\t Total: " + totalTax;
	}
}
