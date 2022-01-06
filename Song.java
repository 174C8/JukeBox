import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Song {
	private int SongId;
	private String Artist;
	private String Genre;
	private String SongName;
	private String album;
	
	public Song(int SongId , String Artist , String Genre , String SongName , String album)
	{
		this.SongId=SongId;
		this.Artist=Artist;
		this.Genre=Genre;
		this.SongName=SongName;
		this.album=album;
	}
	public int getSongId()
	{
		return SongId;
	}
	public void setSongId()
	{
		this.SongId=SongId;
	}
	public String getArtist()
	{
		return Artist;
	}
	public void setArtist()
	{
		this.Artist=Artist;
	}
	public String getGenre()
	{
		return Genre;
	}
	public void setGenre()
	{
		this.Genre=Genre;
	}
	public String getSongName()
	{
		return SongName;
	}
	public void setSongName()
	{
		this.SongName=SongName;
	}
	public String getAlbum()
	{
		return album;
	}
	public void setAlbum()
	{
		this.album=album;
	}
	@Override
	public String toString()
	{
		return ""+System.out.printf("%20s %20s %20s %20s %20s" ,SongId,Artist,Genre,SongName,album+"\n\n")+"";
    }
 
}
