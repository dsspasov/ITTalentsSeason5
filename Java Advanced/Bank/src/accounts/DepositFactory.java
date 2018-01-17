package accounts;

public class DepositFactory {

	public static DepositAccount createDepositAccount(DepositAccount.depositType type, double money){
		if(type==DepositAccount.depositType.Short){
			return new ShortDeposite(money);
		}
		if(type==DepositAccount.depositType.Long){
			return new LongDeposit(money);
		}
		return null;
	}
}
