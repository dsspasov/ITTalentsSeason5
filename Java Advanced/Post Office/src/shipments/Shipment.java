package shipments;

import human.Citizen;

public abstract class Shipment {
	protected Citizen from;
	protected Citizen to;
	protected double tax;
	protected String type;
	
	public Shipment(Citizen from, Citizen to, double tax, String type) {
		this.from = from;
		this.to = to;
		this.tax = tax;
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return type +" FROM: " +from.toString() + " TO; " + to.toString();
	}

	
}
