import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	Connection conn=null;
	public static Connection dbconnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","samyu@C8");
			return conn;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
		
	}
	
}
