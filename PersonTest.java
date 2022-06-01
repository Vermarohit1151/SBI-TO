
public class PersonTest {
public static void main(String[] args) {
	Employee Emp1 = new Employee('M',23,"Rohit Verma",42,"LTCE","CS",1031267,"SBI","Assistant Manager",50000);
	System.out.println(Emp1);
}
}

class Person{
	private char gender;
	private int age;
	private String name;
	
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nPerson [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
	
}
class Student extends Person{
	private int rollno;
	private String collegeName;
	private String stream;
	
	public Student(char gender, int age, String name, int rollno, String collegeName, String stream) {
		super(gender, age, name);
		this.rollno = rollno;
		this.collegeName = collegeName;
		this.stream = stream;
	}

	@Override
	public String toString() {
		return super.toString()+"\nStudent [rollno=" + rollno + ", collegeName=" + collegeName + ", stream=" + stream + "]";
	}
	
	
	
}
class Employee extends Student{
	private int empNo;
	private String companyName;
	private String Designation;
	private int salary;
	
	public Employee(char gender, int age, String name, int rollno, String collegeName, String stream, int empNo,
			String companyName, String designation, int salary) {
		super(gender, age, name, rollno, collegeName, stream);
		this.empNo = empNo;
		this.companyName = companyName;
		Designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+"\nEmployee [empNo=" + empNo + ", companyName=" + companyName + ", Designation=" + Designation
				+ ", salary=" + salary + "]";
	}
	
	
}