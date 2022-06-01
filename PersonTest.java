
public class PersonTest {
public static void main(String[] args) {
	//Employee Emp1 = new Employee('M',23,"Rohit Verma",42,"LTCE","CS",1031267,"SBI","Assistant Manager",50000);
	//System.out.println(Emp1);
	
	Student p1 = new Student('M', 23, "Rohit Verma", 42,"LTCE","CS","DY Patil Marg", "EA 1/7", "Nerul", "MH", "INDIA",400614,
			"Subhash nagar","702","Kalyan","MH","INDIA",421301);
	p1.printPerson();
}
}

class Person{
	private char gender;
	private int age;
	private String name;
	Address homeAddress;
	Address corrAddress;
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	
	public Person(char gender, int age, String name, String area, String house, String city, String state, String country, int pin,
			String area1, String house1, String state1, String city1, String country1, int pin1) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.homeAddress = new Address(area,house,city,state,country,pin);
		this.corrAddress = new Address(area1, house1, city1, state1, country1, pin1);
	}
	
	public void printPerson() {
		System.out.println("NAME   	 : "+name);
		System.out.println("Age    	 :" +age);
		System.out.println("GENDER 	 : "+gender);
		if(homeAddress != null) {
			System.out.println("\nHOME ADDRESS");
			homeAddress.printAddress();
		}
		if(corrAddress!=null) {
			System.out.println("\nCORRESEPONDENCE ADDRESS");
			corrAddress.printAddress();
		}
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
	
	public Student(char gender, int age, String name,int rollno, String collegeName, String stream, String area, String house, String city, String state,
			String country, int pin, String area1, String house1, String state1, String city1, String country1,
			int pin1) 
	{
		super(gender, age, name, area, house, city, state, country, pin, area1, house1, state1, city1, country1, pin1);
		this.rollno = rollno;
		this.collegeName = collegeName;
		this.stream = stream;
		
		// TODO Auto-generated constructor stub
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

class Address{
	private String Area,House,City,State,Country;
	private int pin;
	
	public Address(String area, String house, String city, String state, String country, int pin) {
		super();
		Area = area;
		House = house;
		City = city;
		State = state;
		Country = country;
		this.pin = pin;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getHouse() {
		return House;
	}

	public void setHouse(String house) {
		House = house;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
    public void printAddress() {
    	System.out.println("FLAT NO       :"+House);
    	System.out.println("AREA          :"+Area);
    	System.out.println("CITY          :"+City);
    	System.out.println("STATE         :"+State);
    	System.out.println("COUNTRY       :"+Country);
    	System.out.println("PINCODE       :"+pin);
    }
	
}