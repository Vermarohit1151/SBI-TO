import java.sql.*;

public class SelectTest {
	public static void main(String[] args) {
		//Load the driver
		try {
			System.out.println("Loading the driver...");

			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver Loaded");
			
			System.out.println("Trying to connect to DB");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sysgitc");
			System.out.println("DB connected "+conn);
			Statement stmt = conn.createStatement();
			Statement stmt1 = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * from Dept");
			
			 //stmt1.executeUpdate("INSERT into Dept values(11,'GITC','Navi Mumbai')");
			while(rs.next()) {
				int empNo = rs.getInt(1);
				String deptName = rs.getString(2);
				String job = rs.getString(3);
//				String mgr = rs.getString(4);
//				//String hi = rs.getString(5);
//				String hireDate = rs.getString(5);
//				int sal = rs.getInt(6);
//				int comm = rs.getInt(7);
//				int deptNo= rs.getInt(8);
				System.out.println("Dept. No\t:"+empNo);
				System.out.println("Dept Name\t:"+deptName);
				System.out.println("Location\t:"+job);
//				System.out.println("Dept Name\t:"+empName);
//				System.out.println("Dept Name\t:"+empName);
//				System.out.println("Dept Name\t:"+empName);
//				System.out.println("Dept Name\t:"+empName);
//				System.out.println("Dept Name\t:"+empName);
				System.out.println("---------------------------");
			}
			
			rs.close(); stmt.close(); stmt1.close();  conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
