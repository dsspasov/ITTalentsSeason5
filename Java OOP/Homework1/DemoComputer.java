/*�� �� �������� 2 ������ �� ��� Computer.
�� �� ������� ��������� �� ����� �� ���������� �� year, price,
hardDiskMemory, freeMemory, operationSystem.���� ������� ��������
�� � ������. �� ������ �� ����� ��������� �� �� ������ ����� 100
(���� ������ useMemory), � �� ������, �� �� ����� �������������
������� (���� ������ changeOperationSystem), ���� ����� �� ��
������� �� ������ �������� ������ �� ����� ���������.
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
