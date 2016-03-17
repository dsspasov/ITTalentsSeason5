/*Да се създадат 2 обекта от тип Computer.
Да се зададат стойности на всеки от компютрите за year, price,
hardDiskMemory, freeMemory, operationSystem.Нека единият компютър
да е лаптоп. На единия от двата компютъра да се задели памет 100
(чрез метода useMemory), а на другия, да се смени операционната
система (чрез метода changeOperationSystem), след което да се
изведат на екрана всичките полета на двата компютъра.
*/
public class DemoComputer {
	public static void main(String[] args) {

		Computer pravec = new Computer();
		pravec.year = 1980;
		pravec.price = 300.6;
		pravec.isNotebook = false;
		pravec.hardDiskMemory = 2.5;
		pravec.freeMemory = 1.6;
		pravec.operationSystem = "Windows10";

		Computer chromeBook = new Computer();
		chromeBook.year = 2006;
		chromeBook.price = 450.6;
		chromeBook.isNotebook = true;
		chromeBook.hardDiskMemory = 800;
		chromeBook.freeMemory = 560;
		chromeBook.operationSystem = "ChromeOS";

		pravec.changeOperationSystem("Linux");
		chromeBook.useMemory(100);
		
		pravec.printComputerInfo();
		chromeBook.printComputerInfo();
		

	}
}
