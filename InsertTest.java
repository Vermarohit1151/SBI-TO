import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Loading the driver...");

			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver Loaded");
			
			System.out.println("Trying to connect to DB");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sysgitc");
			System.out.println("DB connected "+conn);
			PreparedStatement pst = conn.prepareStatement("Insert into emp values(?,?,?,?,?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter the starting Hire date for employees");
			//String empTempjob = sc.next();
			//String startDateofHiring = sc.next();
			//System.out.println("Enter the ending Hire date for employees");
			//String endDateofHiring = sc.next();
			System.out.println("Enter employee number");
			int empNumber = sc.nextInt();
			
			System.out.println("Enter employee name");
			String empName = sc.next();
			
			System.out.println("Enter employee role");
			String empJob = sc.next();
			
			System.out.println("Enter manager code");
			int managerCode = sc.nextInt();
			
			System.out.println("Enter hire date");
			String hireDate = sc.next();
			java.sql.Date doj = Date.valueOf(hireDate); 
			
			System.out.println("Enter employee salary");
			int salary = sc.nextInt();
			
			System.out.println("Enter employee commission");
			int empComm = sc.nextInt();
			
			System.out.println("Enter employee department number");
			int empDeptNumber = sc.nextInt();
			
			pst.setInt(1, empNumber);
			pst.setString(2, empName);
			pst.setString(3, empJob);
			pst.setInt(4, managerCode);
			pst.setDate(5, doj);
			pst.setInt(6, salary);
			pst.setInt(7, empComm);
			pst.setInt(8, empDeptNumber);
			
			int rowsInserted = pst.executeUpdate();
			
			System.out.println("Statement executed : rows created : "+rowsInserted);
			pst.close();  conn.close();
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}}
