package instruments.electric;

import instruments.Instrument;

public abstract class Electric extends Instrument{

	public Electric(String name, double price) {
		super(name, price, "Electric");
	}

}
