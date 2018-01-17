package accounts;

public class LoanFactory {

	public static LoanAccount createLoan(LoanAccount.LoanType type, int periodOfTime, double money){
		if(type==LoanAccount.LoanType.ConsumerCredit){
			return new ConsumerCredit(periodOfTime, money);
		}
		if(type==LoanAccount.LoanType.HomeCredit){
			return new HomeCredit(periodOfTime, money);
		}
		return null;
	}
}
