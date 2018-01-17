package shipments;

import human.Citizen;

public class Parcel extends Shipment{
	int width;
	int height;
	int length;
	boolean isBreakable;
	
	
	public Parcel(Citizen from, Citizen to, int width, int height, int length, boolean isBreakable) {
		super(from, to, 2, "Parcel");
		this.width = width;
		this.height = height;
		this.length = length;
		this.isBreakable = isBreakable;
		if(width>60||height>60||length>60){
			if(isBreakable){
				super.tax += super.tax;
			}else{
				super.tax += 0.5*super.tax;
			}
		}
	}


	public boolean isBreakable() {
		return isBreakable;
	}
	
	@Override
	public String toString() {
		return super.toString() + " isBreakable: " + isBreakable; 
	}
	

}
