import instruments.*;
import instruments.percussion.Drum;
import instruments.percussion.Tarambuka;
import instruments.string.Bass;
import instruments.string.Guitar;
import instruments.string.Harp;
import instruments.string.Viola;
import instruments.string.Violin;

import java.util.HashMap;
import java.util.Map;

public class Supplier extends Thread {
	private Map<Instrument, Integer> products = new HashMap<Instrument, Integer>();
	private Shop s;
	public Supplier(Shop s) {
		this.s = s;
		products.put(new Bass("BassAf45", 120), 1000);
		products.put(new Bass("BassAf46", 200), 1000);
		products.put(new Bass("BassAf47", 338), 1500);

		products.put(new Guitar("GuitarGt87", 256), 1000);
		products.put(new Guitar("GuitarGt88", 300), 1000);
		products.put(new Guitar("GuitarGt89", 345), 1000);

		products.put(new Drum("DrumD98", 58), 1000);
		products.put(new Drum("DrumD99", 60), 500);
		products.put(new Drum("DrumD1S", 150), 1000);

		products.put(new Harp("HarpH1", 800), 2000);
		products.put(new Harp("HarpH2", 1000), 2500);

		products.put(new Tarambuka("TarambukaT34", 86), 500);

		products.put(new Viola("ViolaV0I", 350), 1500);
		products.put(new Viola("ViolaV1I", 400), 1500);

		products.put(new Violin("ViolinV14", 236), 1500);
		products.put(new Violin("ViolinV15", 300), 1500);
	}

	public int getInfoForInstrument(String name, int quantity) {
		for (Instrument instrument : products.keySet()) {
			if (instrument.getName().equals(name)) {
				return products.get(instrument) * quantity;
			}
		}
		return 0;
	}

	public Instrument deliverInstrument(String name, int quantity) {
		Instrument orderedInstrument = null;
		for (Instrument instrument : products.keySet()) {
			if (instrument.getName().equals(name)) {
				orderedInstrument = instrument;
				break;
			}
		}
		try {
			Thread.sleep(products.get(orderedInstrument) * quantity);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return orderedInstrument;
	}

	@Override
	public void run() {
		while(true){
			s.deliverInstruments(this);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
