import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class search {
	
	 static Scanner sc = new Scanner(System.in);
public static void displayAllsongs(ArrayList<Song> songlist) throws Exception{
		
		List<Song> Song = songlist.stream()
				.collect(Collectors.toList());
		System.out.printf("%20s %20s %20s %20s %20s %20s","SongId","Artist","Genre","SongName","album","\n");
		System.out.println(Song);
		System.out.println("Enter song id to play song");
		int songid=sc.nextInt();
		AudioPlayer.playwithid(songid);
	}
 public static void displaybySongId(ArrayList<Song> songlist) throws Exception {
	 System.out.println("Enter the songId");
	 int songid = sc.nextInt();
    List<Song> Song1 =
      (
        songlist
          .stream()
          .filter(t -> (t.getSongId() == songid))
          .collect(Collectors.toList())
      );
    System.out.printf("%20s %20s %20s %20s %20s %20s","SongId","Artist","Genre","SongName","album","\n");
    System.out.println(Song1);
    AudioPlayer.playwithid(songid);
  }
  public static void displayByArtist(ArrayList<Song> songlist) throws Exception {
    System.out.println("Enter the Artist : ");
    String artist=sc.nextLine();
    List<Song> Song2 =
      (
        songlist
          .stream()
          .filter(t -> (t.getArtist().equalsIgnoreCase(artist)))
          .collect(Collectors.toList())
      );
    System.out.printf("%20s %25s %15s %10s %20s %20s","SongId","Artist","Genre","SongName","album","\n");
    System.out.println(Song2);
    System.out.println("Enter the song id to play");
    int songid=sc.nextInt();
    AudioPlayer.playwithid(songid);
  }
  public static void displayByGenre(ArrayList<Song> songlist) throws Exception {
    System.out.println("Enter the Genre : ");
    String genre =sc.nextLine();
    List<Song> Song3 =
      (
        songlist
          .stream()
          .filter(t -> (t.getGenre().equalsIgnoreCase(genre)))
          .collect(Collectors.toList())
      );
    System.out.printf("%20s %20s %20s %20s %20s %20s","SongId","Artist","Genre","SongName","album","\n");
    System.out.println(Song3);
    System.out.println("Enter song id to play");
    int songid=sc.nextInt();
    AudioPlayer.playwithid(songid);
  }
  public void displayByAlbum(ArrayList<Song> songlist) throws Exception {
    System.out.println("Enter the Album : ");
    String album = sc.nextLine();
    List<Song> Song4 =
      (
        songlist
          .stream()
          .filter(t -> (t.getAlbum().equalsIgnoreCase(album)))
          .collect(Collectors.toList())
      );
    System.out.printf("%20s %20s %20s %20s %20s %20s","SongId","Artist","Genre","SongName","album","\n");
    System.out.println(Song4);
  }
  public static void displayBySongname(ArrayList<Song> songlist) throws Exception {
    System.out.println("Enter the Song Name : ");
    String songName = sc.nextLine();
    List<Song> Song5 =
      (
        songlist
          .stream()
          .filter(t -> (t.getSongName().equalsIgnoreCase(songName)))
          .collect(Collectors.toList())
      );
    System.out.printf("%20s %20s %20s %20s %20s %20s","SongId","Artist","Genre","SongName","album","\n");
    System.out.println(Song5);
    System.out.println("Enter id to play song");
    int songid=sc.nextInt();
    AudioPlayer.playwithid(songid);
  }
  public void exit() {
	  System.exit(0);
  }
}
