import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class addDelete {
	public static void addsongs(Connection conn)throws Exception
	   {
		   Scanner sc=new Scanner(System.in);
			try{
				System.out.println("Enter song id:");
				int Songid=sc.nextInt();
			
				System.out.println("Enter Artist:");
				String Artist=sc.next();
				
				System.out.println("Enter Genre:");
				String Genre=sc.next();
				
				System.out.println("Enter song name:");
				String SongName=sc.next();
				
				System.out.println("Enter album:");
				String album=sc.next();
				
				PreparedStatement pst=conn.prepareStatement("insert into songsList values(? , ? , ? , ? , ?)");
				
				pst.setInt(1, Songid);
				pst.setString(2, Artist);
				pst.setString(3, Genre);
				pst.setString(4, SongName);
				pst.setString(5, album);
				pst.executeUpdate();
				System.out.println("Successfully added");
				System.out.println("You want to add more songs y or n");
				char yesorno=sc.next().charAt(0);
				if(yesorno=='y')
				{
					addDelete.addsongs(conn);
				}
				else if(yesorno=='n')
				{
					Display.display();
				}
				else
					System.out.println("Enter valid choice");
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}			   
	   }
	   public void deletesong(int sondid) throws SQLException
	   {
		   String query="delete * from songsList where SongId=?";
		   Connection conn =DB.dbconnect();
	       PreparedStatement preparedstmt=conn.prepareStatement(query);
		try {
			preparedstmt.setInt(1,sondid);
			preparedstmt.execute();
			System.out.println("Song deleted");
			Display.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	   }
}
