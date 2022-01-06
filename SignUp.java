import java.sql.*;
import java.util.*;

public class Signup
	    {
	     public static void welcomepage() {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("\n 1.New User \n 2.Existing User");
	       
	       int choice=sc.nextInt();
	       if(choice>0 && choice<3)
	       {
	       Connection conn =DB.dbconnect();
		switch(choice)
	                   {   
	                      case 1: try{
	                    	     user.createuser(conn);
	                                 } 
	                             catch(Exception e)
	                      {
	                            	 e.printStackTrace();
	                      }
	                             
	                             break;
	                       case 2:try {
	                    	       user.existinguser(conn);
	                                  }
	                                catch(Exception e)
	                                  {
	                    	            e.printStackTrace();
	                                  }
	                    	   
	                            break;
	                    }
	          }
	       
	        else {
	             System.out.println("Please enter valid choice");
		
    	}

   }
}
	  

