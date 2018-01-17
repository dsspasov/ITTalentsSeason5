import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exceptions.IllegalTypeException;
import accounts.DepositAccount;
import accounts.LoanAccount;

public class Client {
	private String name;
	private String address;
	private double cash;
	private double salary;
	private List<DepositAccount> deposits;
	private List<LoanAccount> loans;
	
	public Client(String name, String address, double money, double salary){
		this.name = name;
		this.address = address;
		this.cash = money;
		this.salary = salary;
		this.deposits = new ArrayList<DepositAccount>();
		this.loans = new ArrayList<LoanAccount>(); 
	}
	
	//
	public double getMoney() {
		return cash;
	}
	
	//
	public void setMoney(double money){
		this.cash = money;
	}
	
	//
	public double getSalary() {
		return salary;
	}

	//
	public List<LoanAccount> getLoans() {
		return loans;
	}
	
	void askForLoan(double money, int periodOfTime, Bank bank, LoanAccount.LoanType type){
		try {
			bank.lendLoan(this, money, periodOfTime, type);
		} catch (IllegalTypeException e) {
			System.out.println("Loan for: " + this.name + " " + e.getMessage());
		}
	}
	
	void payLoans(Bank bank){
		for(Iterator<LoanAccount> it = loans.iterator(); it.hasNext(); ){
			LoanAccount loan = it.next();
			if(this.cash>loan.getMonthlyFee()){
				if(loan.getBalance()>0){
					loan.setBalance(loan.getBalance() - loan.getMonthlyFee());
					cash -= loan.getMonthlyFee();
					bank.addMoney(loan.getMonthlyFee());
				}else{
					it.remove();
					System.out.println("Loan is paid");
				}
			}else{
				System.out.println("You do not have money.Please sell your kidney :)!");
			}
		}
	}
	
	void askForDeposit(double money, Bank bank, DepositAccount.depositType type){
		if(this.cash>money){
			try {
				DepositAccount d = bank.createDeposite(money, type);
				deposits.add(d);
				this.cash -= money;
			} catch (IllegalTypeException e) {
				System.out.println("Deposit for: " +this.name + " " + e.getMessage());
			}
		}else{
			System.out.println("Not enought money exception");
		}
	}
	
	public void withdrawMoneyFromDeposits(Bank bank){
		for(Iterator<DepositAccount> it = deposits.iterator(); it.hasNext(); ){
			DepositAccount d = it.next();
			if(d.getPeriodOfTime()==0){
				double allSum = d.getBalance() + d.getPaidDividend();
				this.cash += allSum;
				bank.removeDeposit(d);
				it.remove();
			}
		}
	}
	
	public void printInfo(){
		System.out.println(this.name + ", " + this.address + ", " + this.cash + ", " + this.salary);
		for(DepositAccount deposit:deposits){
			System.out.println(deposit);
			System.out.println("********************************");
		}
		
		for(LoanAccount loan:loans){
			System.out.println(loan);
			System.out.println("*********************************");
		}
	}
}
