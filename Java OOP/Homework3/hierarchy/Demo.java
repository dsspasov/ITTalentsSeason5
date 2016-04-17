package hierarchy;

public class Demo {
	public static void main(String[] args) {
		Person[] humans = new Person[10];

		humans[0] = new Person("Ivan", 20, true);
		humans[1] = new Person("Petar", 24, true);

		humans[2] = new Student("Georgi", 15, true, 5.5);
		humans[3] = new Student("Petia", 16, false, 5.8);

		humans[4] = new Employee("Ani", 26, false, 80);
		humans[5] = new Employee("Todor", 17, true, 100);
		
		for (int i = 0; i < humans.length; i++) {
			if (humans[i] != null) {
				if (humans[i] instanceof Student) {
					System.out.println("-----Student----");
					((Student) humans[i]).showStudentInfo();
				} else if (humans[i] instanceof Employee) {
					System.out.println("-----Employee----");
					((Employee) humans[i]).showEmployeeInfo();
				}else{
					System.out.println("-----Person----");
					humans[i].showPersonInfo();
					//System.out.println();
				}
			}
		}
		
		
		for (int i = 0; i < humans.length; i++) {
			if (humans[i] != null) {
				if (humans[i] instanceof Employee) {
					double money = ((Employee) humans[i]).calculateOvertime(2);
					System.out.println(money);
				}
			}
		}

	}
}
