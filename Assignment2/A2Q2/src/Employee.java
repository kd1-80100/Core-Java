/*
Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */
public class Employee {
	String first_name;
	String last_name;
	double mSalary;

	public Employee(String first_name, String last_name, double mSalary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.mSalary = mSalary;
	}

	public Employee() {
		this.first_name = " ";
		this.last_name = " ";
		this.mSalary = 0;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getmSalary() {
		return mSalary;
	}

	public void setmSalary(double mSalary) {
		if (mSalary>0) {
			this.mSalary = mSalary;
		}
	}
	public void displaySalary() {
		System.out.println("Employee name:"+this.first_name+" "+this.last_name);
		System.out.println("Annual salary of employee:"+(this.mSalary*12));
	}
	public void increment() {
		System.out.println("Employee Name:"+this.first_name+" "+this.last_name);
		System.out.println("Employees' yearly salary after 10% hike:"+(this.mSalary+(this.mSalary*0.1))*12);
	}
}
