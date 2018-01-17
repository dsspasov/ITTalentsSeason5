package accounts;

public abstract class Account {
	protected String name;
	protected double yearlyInterest;
	protected int periodOfTime;//in months
	protected double balance;
	
	public Account(String name, double yearlyInterest, int periodOfTime, double money) {
		this.name = name;
		if(yearlyInterest>0)
			this.yearlyInterest = yearlyInterest;
		else
			this.yearlyInterest = 0;
		if(periodOfTime>=1&&periodOfTime<=60)
			this.periodOfTime = periodOfTime;
		else
			this.periodOfTime = 0;
		if(money>0)
			this.balance = money;
		else
			this.balance = 0;
	}

	public int getPeriodOfTime() {
		return periodOfTime;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return name + "\n\t Yearly interest: " + yearlyInterest + "\n\t Period of time: " +periodOfTime + "\n\t Balance: " + balance;
	}
}
