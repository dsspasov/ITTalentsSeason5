import java.util.Random;

import accounts.DepositAccount;
import accounts.LoanAccount;
import accounts.LoanAccount.LoanType;


public class Demo {
	public static void main(String[] args) {
		
		Bank fbank= new Bank("FiBank", "Sofia");
		
		Client petar = new Client("Petar", "Sofia", 100, 600);
		Client ivan = new Client("Ivan", "Sofia", 200, 700);
		Client stoyan = new Client("Stoyan", "Sofia", 300, 800);
		Client georgi = new Client("Georgi", "Sofia", 400, 900);
		Client kaloyan = new Client("Kaloyan", "Sofia", 500, 1000);
		Client gerasim = new Client("Gerasim", "Sofia", 600, 1100);
		Client ivaylo = new Client("Ivaylo", "Sofia", 700, 1200);
		Client stanimir = new Client("Stanimir", "Sofia", 800, 1300);
		Client martin = new Client("Martin", "Sofia", 900, 1400);
		Client vinetu = new Client("Vinetu", "Sofia", 1000, 1500);
		
		Client[] clients = new Client[]{
				petar, ivan, stoyan, georgi, kaloyan, gerasim, ivaylo, stanimir, martin, vinetu
		};
		
		clients[0].askForDeposit(clients[0].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Short);
		clients[1].askForDeposit(clients[1].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Short);
		clients[2].askForDeposit(clients[2].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Short);
		clients[3].askForDeposit(clients[3].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Short);
		clients[4].askForDeposit(clients[4].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Long);
		clients[5].askForDeposit(clients[5].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Short);
		clients[6].askForDeposit(clients[6].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Short);
		clients[7].askForDeposit(clients[7].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Long);
		clients[8].askForDeposit(clients[8].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Long);
		clients[9].askForDeposit(clients[9].getMoney()*generatePercentage(), fbank, DepositAccount.depositType.Long);

		
		fbank.printInfo();

		for(Client client:clients){
			client.askForLoan(50, 10, fbank, generateLoanType());
		}
		
		for(Client client:clients){
			System.out.print("Client: ");
			client.printInfo();
		}
		
		for(Client client:clients){
			client.payLoans(fbank);
		}
	}
	
	public static LoanAccount.LoanType generateLoanType(){
		Random x = new Random();
		if(x.nextBoolean()){
			return LoanType.ConsumerCredit;
		}
		return LoanType.HomeCredit;
	}
	
	public static double generatePercentage(){
		Random x = new Random();
		return ((double)(x.nextInt(21) + 80))/100;
	}
}
