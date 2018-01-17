package instruments.keybord;

import instruments.Instrument;

public abstract class KeybordInstrument extends Instrument {

	public KeybordInstrument(String name, double price) {
		super(name, price, "Keybord");
	}

}
