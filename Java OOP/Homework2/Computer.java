/*Създайте клас Computer, който представя компютър.
Класът да има следните полета:
year – числова стойност, показваща година на производство на
компютъра
price – числова стойност (не е задължително да е цяло число),
показваща цената на компютъра
isNotebook – булева стойност – дали компютъра е преносим или не
hardDiskMemory – числова стойност за размера на хардиска
freeMemory – числова стойност, показваща размера на свободната
памет
operationSystem – текстово поле за операционната система на
компютъра
Класът да дефинира следните методи:
-метод changeOperationSystem(newOperationSystem), който сменя
стойността на полето operationSystem със стойността, подадена като
параметър.
-метод useMemory(memory), който намалява свободната памет
(freeMemory) със стойността, подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет,
извежда съобщение "Not enough free memory!"*/
public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory; // in GB
	private double freeMemory;// in GB
	private String operationSystem;

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.setYear(year);
		this.setPrice(price);
		this.setHardDiskMemory(hardDiskMemory);
		this.setFreeMemory(freeMemory);
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory,
			double freeMemory, String operationSystem) {
		this.setYear(year);
		this.setPrice(price);
		this.setNotebook(isNotebook);
		this.setHardDiskMemory(hardDiskMemory);
		this.setFreeMemory(freeMemory);
		this.setOperationSystem(operationSystem);
		
	}

	private void setYear(int year) {
		if (year > 0 ){
			this.year = year;
		}else{
			this.year = 1970;
		}
	}

	private void setPrice(double price) {
		if (price > 0){
			this.price = price;
		}else{
			this.price = 100;
		}
	}

	private void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}

	private void setHardDiskMemory(double hardDiskMemory) {
		if(this.hardDiskMemory>0){
			this.hardDiskMemory = hardDiskMemory;
		}else{
			this.hardDiskMemory = 1;
		}
	}

	private void setFreeMemory(double freeMemory) {
		if(this.freeMemory>0){
			this.freeMemory = freeMemory;
		}else{
			this.freeMemory = 1;
		}
	}

	private void setOperationSystem(String operationSystem) {
		if(this.operationSystem.length()>0){
			this.operationSystem = operationSystem;
		}else{
			this.operationSystem = "Win XP";
		}
	}

	void changeOperationSystem(String newOperationSystem) {
		this.setOperationSystem(newOperationSystem);
	}

	void useMemory(int memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			this.freeMemory -= memory;
		}
	}

	void printComputerInfo() {
		System.out.println(this.year + ", " + this.price + ", "
				+ this.isNotebook + ", " + this.hardDiskMemory + ", "
				+ this.freeMemory + ", " + this.operationSystem);
	}

	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price == c.price) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Computer computer = new Computer();
		System.out.println(computer.operationSystem);
		Computer pravec = new Computer(1980, 380, 400, 200);
		Computer chromeBook = new Computer(2010, 400, true, 800, 600, "Chrome OS");

		if (pravec.comparePrice(chromeBook) == 1) {
			System.out
					.println("The second computer is more expensive than the first!");
		} else if (pravec.comparePrice(chromeBook) == 0) {
			System.out.println("The computers have same price!");
		} else {
			System.out
					.println("The second computer is cheaper than the first!");
		}

	}
}
