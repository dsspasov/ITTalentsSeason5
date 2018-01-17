package instruments;

public abstract class Instrument {
	private String name;
	private double price;
	private String type;
	
	public Instrument(String name, double price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public Instrument(Instrument inst){
		this(inst.name, inst.price, inst.type);
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public void setPrice(double price){
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.type + " " + this.name + " " + this.price;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrument other = (Instrument) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	
	
	
}
