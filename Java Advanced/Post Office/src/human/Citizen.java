package human;

import java.time.LocalDateTime;

import post.PostBox;
import post.PostOffice;
import shipments.Letter;
import shipments.Shipment;

public class Citizen extends Person{
	private String address;
	public Citizen(String fName, String lName, String address) {
		super(fName, lName);
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void sendShipment(PostOffice p, Shipment s){
		p.addShipment(s, LocalDateTime.now());
	}
	
	public void sendLetter(PostBox p, Letter l){
		p.addLetter(l, LocalDateTime.now());
	}
	
}
