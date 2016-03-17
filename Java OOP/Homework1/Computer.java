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
	short year;
	double price;
	boolean isNotebook;
	double hardDiskMemory; //in GB
	double freeMemory;// in GB
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem){
		this.operationSystem = newOperationSystem;
	}
	
	void useMemory(int memory){
		if(memory>this.freeMemory){
			System.out.println("Not enough free memory!");
		}else{
			this.freeMemory -= memory;
		}
	}
	
	 void printComputerInfo(){
			System.out.println(this.year + ", " + this.price + ", "
					+ this.isNotebook + ", " + this.hardDiskMemory + ", "
					+ this.freeMemory + ", " + this.operationSystem);
		}
	
}
