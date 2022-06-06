import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectWhereTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Loading the driver...");

			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver Loaded");
			
			System.out.println("Trying to connect to DB");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sysgitc");
			System.out.println("DB connected "+conn);
			Statement stmt = conn.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the starting Hire date for employees");
			//String empTempjob = sc.next();
			String startDateofHiring = sc.next();
			System.out.println("Enter the ending Hire date for employees");
			String endDateofHiring = sc.next();
			ResultSet rs = stmt.executeQuery("SELECT * FROM emp"
					+ " where hiredate>="+"'"+startDateofHiring+"'"+"and hiredate<="+"'"+endDateofHiring +"'");

			
			//System.out.println("Statement executed:");
			
			if(rs.getRow()!=0){
				System.out.println("Inside If");
				while(rs.next()) {
					int empNo = rs.getInt(1);
					String empName = rs.getString(2);
					String designation = rs.getString(3);
					
					System.out.println("Emp. No \t:"+empNo);
					System.out.println("Emp Name\t:"+empName);
					System.out.println("Designation\t:"+designation);
					System.out.println("-------------------------------");
				}
				
			}
			else {
				System.out.println("Inside Else");
				throw new EmployeeNotFoundException();
			}
			
			rs.close(); stmt.close(); conn.close();
	}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}	

}
