package instruments.percussion;

import instruments.Instrument;

public abstract class Percussion extends Instrument{

	public Percussion(String name, double price) {
		super(name, price, "Percussion");
	}
}
