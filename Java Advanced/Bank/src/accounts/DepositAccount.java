package accounts;

public class DepositAccount extends Account {

	private double paidDividend;//monthly
	
	public enum depositType{
		Short,
		Long
	}
																//months
	public DepositAccount(String name, double yearlyInterest, int periodOfTime, double money) {
		super(name, yearlyInterest, periodOfTime, money);
		this.paidDividend= 0;

	}
		
	public double getPaidDividend(){
		return this.paidDividend;
	}
	
	public double payDividend(){
		if(super.periodOfTime>0){
			this.paidDividend += super.balance*super.yearlyInterest/12;
			super.periodOfTime -= 1;
		}
		return super.balance*super.yearlyInterest/12;
	}
	
	@Override
	public String toString() {
		return super.toString() + " \n\t Paid dividend: " + paidDividend;
	}
}
