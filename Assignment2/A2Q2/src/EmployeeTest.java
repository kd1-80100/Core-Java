
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee("Pavan","Patil",50000);
		Employee e2=new Employee("Pranav","Patil",70000);
		e1.displaySalary();
		e1.increment();
		e2.displaySalary();
		e2.increment();
	}
}
