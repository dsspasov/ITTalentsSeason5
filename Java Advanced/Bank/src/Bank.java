import java.util.ArrayList;
import java.util.HashMap;

import exceptions.IllegalTypeException;
import accounts.Account;
import accounts.DepositAccount;
import accounts.DepositFactory;
import accounts.LoanAccount;
import accounts.LoanFactory;


public class Bank {
	private String name;
	private String address;
	private HashMap<String, ArrayList<Account>> accounts;
	private double reserve;
	private double balance;
	
	Bank(String name, String address){
		this.name = name;
		this.address = address;
		this.accounts = new HashMap<String, ArrayList<Account>>();
		accounts.put("Deposit", new ArrayList<Account>());
		accounts.put("Loan", new ArrayList<Account>());
		this.balance = 100;
		this.reserve = 0;
	}
	
	DepositAccount createDeposite(double money, DepositAccount.depositType type) throws IllegalTypeException{
		DepositAccount d = DepositFactory.createDepositAccount(type, money);
		if(d==null){
			throw new IllegalTypeException("Deposit type is wrong! Please enter correct type!");
		}else{
			this.balance += money;
			this.reserve += 0.9*money;
			this.accounts.get("Deposit").add(d);
		}
		return d;
	}
	
	void removeDeposit(DepositAccount d){
		this.balance -= d.getBalance() + d.getPaidDividend();
		this.reserve -= 0.9*d.getBalance();
		if(!this.accounts.get("Deposit").isEmpty())
			this.accounts.get("Deposit").remove(d);
	}
	
	void lendLoan(Client client, double money, int periodOfTime, LoanAccount.LoanType type) throws IllegalTypeException{
		double loanSum = 0;
		for(LoanAccount loan:client.getLoans()){
			loanSum+=loan.getMonthlyFee();
		}
		
		if(loanSum>0.5*client.getSalary()){
			System.out.println("Not enough money to pay for loans");
		}else{
			if(this.balance-money>reserve/9){//10% of deposit sum
				LoanAccount loan = LoanFactory.createLoan(type, periodOfTime, money);
				if(loan==null){
					throw new IllegalTypeException("Loan type is wrong! Please enter correct type!");
				}else{
					this.accounts.get("Loan").add(loan);
					this.balance -= money;
					client.setMoney(client.getMoney()+money);
					client.getLoans().add(loan);
				}
			}else{
				System.out.println("We can't lend you this amount of money");				
			}
		}
	}
	
	void payDividend(){
		for(Account deposit:accounts.get("Deposit")){
			((DepositAccount)(deposit)).payDividend();
		}
	}
		
	public void printInfo(){
		System.out.println(this.name + " " + this.address + " Reserve: " + this.reserve + ", Balance: " + this.balance);
	}

	void addMoney(double money){
		balance+=money;
	}
}
