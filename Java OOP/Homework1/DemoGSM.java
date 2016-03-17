
public class DemoGSM {
	public static void main(String[] args) {
		Call.priceForCall = 0.3;
		GSM nokia = new GSM();
		nokia.model = "Nokia 6303";
		nokia.insertSimCart("0896843210");
		
		GSM samsung = new GSM();
		samsung.model = "Samsung GalaxyS6";
		samsung.insertSimCart("0889654321");
		
		nokia.call(samsung, 3601);
		
		nokia.printInfoForTheLastIncomingCall();
		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastOutgoingCall();
		
		System.out.println(nokia.getSumForCall());
		System.out.println(samsung.getSumForCall());
		
	}
}
