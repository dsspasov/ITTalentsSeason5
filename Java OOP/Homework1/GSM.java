/*Класът GSM да съдържа полетата:
model – модел на телефона
hasSimCard – дали в телефона е заредена SIM карта
simMobileNumber – номер на SIM картата(телефонен номер), ако е
заредена такава.
outgoingCallsDuration – общото време (в минути) на изходящите
повиквания
lastIncomingCall – последното входящо повикване
lastOutgoingCall – последното изходящо повикване
Да се напишат следните методи за класа GSM:
- insertSimCard(simMobileNumber) – метода задава номер(сим карта)
на телефона. Да се провери дали подаденият номер е валиден
(започва с 08 и се състои от 10 цифри). Ако номерът е валиден, го
задава на телефона и задава стойност true на полето hasSimCard
- removeSimCard() - премахва сим картата от телефона (задава false
на полето hasSimCard)
- call( receiver, duration) – В тялото му да се направят проверки за:
• дали въведената дължина на разговора е валидна
• дали двата телефона (този за който се извиква метода и
този към който се прави обаждането) не са един и същ телефон
• дали и двата телефона имат сим карта
Ако всички проверки преминат успешно, метода прави обаждане с
продължителност duration към телефона, подаден като параметър.
Задава това обаждане като последно изходящо повикване на
телефона от който се прави повикването (телефона за който се
извиква метода) и задава същото обаждане като последно входящо за
телефона към който се прави обаждането.
Осен това увеличава стойността на outgoingCallsDuration със
дължината на разговора за телефона от който се прави обаждането.
Да се направи и метод getSumForCall(), който връща сумата,
начислена за изходящите повиквания на телефона (общото време на
изходящите повиквания по цената за минута - priceForAMinute).
Да се направят два метода
printInfoForTheLastOutgoingCall() и
printInfoForTheLastIncomingCall()
които извеждат информация за последното изходящо/входящо
повиквана на телефона (ако има такова)*/


public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;//in seconds
	Call lastIncomingCall;
	Call lastOutcomingCall;
	
	void insertSimCart(String newSimMobileNumber){
		if(newSimMobileNumber.matches("08[0-9]{8}")){
			simMobileNumber = newSimMobileNumber;
			hasSimCard = true;
		}else{
			hasSimCard = false;
			simMobileNumber = "";
		}
	}
	
	void removeSimCard(){
		hasSimCard = false;
	}

	void call(GSM receiver, int duration){
		boolean isValid = true;
		if(duration<=0){
			isValid = false;
		}
		if(this==receiver){
			isValid = false;
		}
		if(!this.hasSimCard||!receiver.hasSimCard){
			isValid = false;
		}
		
		if(isValid){
			outgoingCallsDuration += duration;
			Call call = new Call();
			call.caller = this;
			call.receiver = receiver;
			call.duration = duration;//seconds
			this.lastOutcomingCall = call;
			receiver.lastIncomingCall = call;
		}else{
			System.out.println("Sorry! Invalid call!");
		}
	}

	double getSumForCall(){
		if(outgoingCallsDuration%60==0){
			return (outgoingCallsDuration/60)*Call.priceForCall;
		}else{
			//outgoingCallsDuration to minutes * priceForCall per minute
			return (outgoingCallsDuration/60+1)*Call.priceForCall;
		}
	}

	void printInfoForTheLastOutgoingCall(){
		if(lastOutcomingCall!=null){
			System.out.println("Last outcoming call: \n" + getInfoForCall(lastOutcomingCall));
			
		}else{
			System.out.println("There aren't any outcoming calls");
		}
	}
	
	void printInfoForTheLastIncomingCall(){
		if(lastIncomingCall!=null){			
			System.out.println("Last incoming call :\n" + getInfoForCall(lastIncomingCall));
		}else{
			System.out.println("There aren't any incoming calls");
		}
		
	}

	private String getInfoForCall(Call call){
		GSM caller = call.caller;
		GSM receiver = call.receiver;
		String duration = convertDurationToReadableString(call.duration);
		StringBuilder output = new StringBuilder("\tDuration: " + duration + "\n");
		output.append("\tCaller: " + caller.simMobileNumber + ", model: " + caller.model+"\n");
		output.append("\tReceiver: " + receiver.simMobileNumber + ", model: " + receiver.model+"\n");
		return output.toString();
		
		
	}
	
	private String convertDurationToReadableString(int duration){
		int seconds = duration%60;
		int minutes = duration%3600/60;
		int hours = duration/3600;
		return hours + ":" + minutes + ":" + seconds;
	}
}
