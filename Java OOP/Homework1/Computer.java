/*�������� ���� Computer, ����� ��������� ��������.
������ �� ��� �������� ������:
year � ������� ��������, ��������� ������ �� ������������ ��
���������
price � ������� �������� (�� � ������������ �� � ���� �����),
��������� ������ �� ���������
isNotebook � ������ �������� � ���� ��������� � �������� ��� ��
hardDiskMemory � ������� �������� �� ������� �� ��������
freeMemory � ������� ��������, ��������� ������� �� ����������
�����
operationSystem � �������� ���� �� ������������� ������� ��
���������
������ �� �������� �������� ������:
-����� changeOperationSystem(newOperationSystem), ����� �����
���������� �� ������ operationSystem ��� ����������, �������� ����
���������.
-����� useMemory(memory), ����� �������� ���������� �����
(freeMemory) ��� ����������, �������� ���� ��������.
��� ���������� �� ��������� � ��-������ �� ���������� �����,
������� ��������� "Not enough free memory!"*/
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
