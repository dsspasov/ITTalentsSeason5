package accounts;

public class ConsumerCredit extends LoanAccount{

	public ConsumerCredit(int periodOfTime,
			double money) {
		super("ConsumerCredit", 0.1, periodOfTime, money);
	}

}
