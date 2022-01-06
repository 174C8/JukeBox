import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {
	 public static void playwithid(int songid) throws Exception
	   {
	Scanner sc1=new Scanner(System.in);
		try 
		{ 
			String url="C:\\Users\\Kadarla Vinay Kumar\\Music\\Bathukamma Patalu - (2015)\\";
			Clip clip =AudioSystem.getClip();
			File f= new File(url+songid+".wav");
			AudioInputStream inputStream=AudioSystem.getAudioInputStream(f.getAbsoluteFile());
			clip.open(inputStream);
			clip.start();
	       
		    int option;
		        
	            System.out.println("\n1.play\n2.stop\n3.Reset") ;
				option=sc1.nextInt();
				switch(option)
				{
				case(1): clip.start();
			               clip.loop(Clip.LOOP_CONTINUOUSLY);
				break;
				case(2): clip.close();
				           break;
				case(3): clip.setMicrosecondPosition(0);
				         
				          break;
				          default:System.out.println("Not a valid response");
				}
			
		
		System.out.println("C=continue song , Q=Quit");
		System.out.println("You want to continue or quit");
		String cq=sc1.next();
		if(cq.equalsIgnoreCase("c"))
		{
			Display.display();
		}
		else if(cq.equalsIgnoreCase("q"))
		{
		System.out.println("Thanks for Visiting");
		}
		else
			System.out.println("Enter valid choice");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.out.println("You want to continue or exit select y or n");
			char c=sc1.next().charAt(0);
			if(c=='y')
			{
				Display.display();
			}
			else if(c=='n')
			{
				welcome.end();
			}
			else
				System.out.println("Enter valid choice");
		}
		
	}
	
}
