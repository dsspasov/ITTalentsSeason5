/*������ GSM �� ������� ��������:
model � ����� �� ��������
hasSimCard � ���� � �������� � �������� SIM �����
simMobileNumber � ����� �� SIM �������(��������� �����), ��� �
�������� ������.
outgoingCallsDuration � ������ ����� (� ������) �� ����������
����������
lastIncomingCall � ���������� ������� ���������
lastOutgoingCall � ���������� �������� ���������
�� �� ������� �������� ������ �� ����� GSM:
- insertSimCard(simMobileNumber) � ������ ������ �����(��� �����)
�� ��������. �� �� ������� ���� ���������� ����� � �������
(������� � 08 � �� ������ �� 10 �����). ��� ������� � �������, ��
������ �� �������� � ������ �������� true �� ������ hasSimCard
- removeSimCard() - �������� ��� ������� �� �������� (������ false
�� ������ hasSimCard)
- call( receiver, duration) � � ������ �� �� �� �������� �������� ��:
� ���� ���������� ������� �� ��������� � �������
� ���� ����� �������� (���� �� ����� �� ������� ������ �
���� ��� ����� �� ����� ����������) �� �� ���� � ��� �������
� ���� � ����� �������� ���� ��� �����
��� ������ �������� �������� �������, ������ ����� �������� �
��������������� duration ��� ��������, ������� ���� ���������.
������ ���� �������� ���� �������� �������� ��������� ��
�������� �� ����� �� ����� ����������� (�������� �� ����� ��
������� ������) � ������ ������ �������� ���� �������� ������� ��
�������� ��� ����� �� ����� ����������.
���� ���� ��������� ���������� �� outgoingCallsDuration ���
��������� �� ��������� �� �������� �� ����� �� ����� ����������.
�� �� ������� � ����� getSumForCall(), ����� ����� ������,
��������� �� ���������� ���������� �� �������� (������ ����� ��
���������� ���������� �� ������ �� ������ - priceForAMinute).
�� �� �������� ��� ������
printInfoForTheLastOutgoingCall() �
printInfoForTheLastIncomingCall()
����� �������� ���������� �� ���������� ��������/�������
��������� �� �������� (��� ��� ������)*/


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
