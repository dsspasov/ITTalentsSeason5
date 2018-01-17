package shipments;

import human.Citizen;

public class Letter extends Shipment{

	public Letter(Citizen from, Citizen to) {
		super(from, to, 0.5, "Letter");
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	

}
