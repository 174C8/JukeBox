import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class user {
	public static void createuser(Connection conn)throws SQLException
	{
		Scanner sc=new Scanner(System.in);
				try{
					System.out.println("Enter FirstName:");
					String firstName=sc.nextLine();
					
					System.out.println("Enter LastName:");
					String lastName=sc.nextLine();
					
					System.out.println("Enter UserId:");
					String userId=sc.next();
					
					System.out.println("Enter Password:");
					String password=sc.next();
					
					System.out.println("Enter EmailID:");
					String emailId=sc.next();
					
					PreparedStatement pst=conn.prepareStatement("insert into userList values(? , ? , ? , ? , ?)");
					
					pst.setString(1, firstName);
					pst.setString(2, lastName);
					pst.setString(3, userId);
					pst.setString(4, password);
					pst.setString(5, emailId);
					pst.executeUpdate();
					
					System.out.println("SignedUp Successfully");
					System.out.println("please Login again");
					Signup.welcomepage();
					
					
					
				
				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	  }
	public static void existinguser(Connection conn)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserID:");
		String userId=sc.nextLine();
		System.out.println("Enter Password:");
		String password=sc.next();
		PreparedStatement pst=conn.prepareStatement("select * from userList where userId=? and password=?");
		pst.setString(1, userId);
		pst.setString(2, password);
		ResultSet rst=pst.executeQuery();
		 if(rst.next()) {
             
		     Display.display();
		 }
          else {
             System.out.println("Invalid user name or password");
             Signup.welcomepage();
             }

  } 
}
