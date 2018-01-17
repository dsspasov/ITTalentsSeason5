package accounts;

public class HomeCredit extends LoanAccount{

	public HomeCredit(int periodOfTime,
			double money) {
		super("HomeCredit", 0.06, periodOfTime, money);
	}

}
