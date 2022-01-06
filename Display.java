import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Display {
	public static void display() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter your Choice");
		System.out.println("\n1.Display all Songs details\n2.Search\n3.add songs\n4.delete songs\n5.exit");
		int choice1=sc.nextInt();
		 search sr = new search();
		Connection con = DB.dbconnect();
		    String query = "select * from songsList";
		    PreparedStatement st = con.prepareStatement(query);
		    ResultSet rs = st.executeQuery();
		    ArrayList<Song> songlist = new ArrayList<>();
		    while (rs.next()) {
		      songlist.add(
		        new Song(
		          rs.getInt(1),
		          rs.getString(2),
		          rs.getString(3),
		          rs.getString(4),
		          rs.getString(5)
		         
		        )
		      );
		    }
		switch(choice1)
		{
		case 1: search.displayAllsongs(songlist);
		        break;
		case 2:System.out.println("\n1.search by song name\n2.search by song id\n3.search by Artist\n4.search by Genre") ;
		       int srch=sc.nextInt();
		       if(srch==1)
		       {
		    	   search.displayBySongname(songlist);
		       }
		       else if(srch==2) {
		    	   search.displaybySongId(songlist);
		       }
		       else if(srch==3)
		       {
		    	   search.displayByArtist(songlist);
		       }
		       else if(srch==4)
		       {
		    	   search.displayByGenre(songlist);
		       }
		       else
		    	   System.out.println("Invalid choice");
		       
		    break; 
		case 3: addDelete.addsongs(con);
		         break;
		case 4: System.out.println("Enter song id to delete");
		        int songid=sc.nextInt();
		        addDelete add=new addDelete();
		        add.deletesong(songid);
		        break;
		case 5:welcome.end();
		       break;
		default : System.out.println("error");
		          break;
	}

  }
}
