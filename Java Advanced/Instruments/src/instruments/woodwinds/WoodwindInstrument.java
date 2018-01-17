package instruments.woodwinds;

import instruments.Instrument;

public abstract class WoodwindInstrument extends Instrument{

	public WoodwindInstrument(String name, double price) {
		super(name, price, "Woodwind");
	}

}
