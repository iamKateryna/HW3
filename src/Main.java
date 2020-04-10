public class Main {

    public static void main(String[] args) {
	/*Person person1 = new Person();
	person1.input();
	person1.output();
	person1.changename("blah", "blah");
	person1.output();


	Person person2 = new Person();
	person2.input();
	person2.output();

	Person person3 = new Person();
	person3.input();
	person3.output();

	Person person4 = new Person();
	person4.input();
	person4.output();

	Person person5 = new Person();
	person5.input();
	person5.output();*/

	    Employee manager = new Employee("Andy", 44, 20);
		Employee trainee = new Employee("Alice", 20, 8);
		Employee administrator = new Employee("Mark", 40, 8);

		System.out.println((manager.getSalary() + trainee.getSalary() + administrator.getSalary()));

		}
	}

