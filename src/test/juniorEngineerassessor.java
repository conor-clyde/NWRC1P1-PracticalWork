package test;

import java.io.IOException;
import java.util.*;

public class juniorEngineerassessor 
{

	    private static ArrayList<Engineer> jes = new ArrayList<Engineer>();

	    public static boolean assessthem(String name, int s, String sex) throws IOException
	    {
	    	 boolean valid = true;
	    	
	         try
	         {
	             jes.add(new Engineer(name, s, sex));
	             System.out.println("Processing " + name);
	             
	             if (sex != "MALE" && sex != "FEMALE" && sex != "OTHER" && sex != "PREFER NOT TO SAY") 
	            	 throw new Exception("Error: Error Description1");
	             
	             else if (name.isEmpty())
	            	 throw new Exception("Error: Error Description");
	             
	             else if (s < 70 && s > 60)      
	                 throw new Exception("Error: Error DescriptionR");
	             else if (sex.equals("MALE") && s == 0)
	            	 throw new Exception("Error: Error Description");
	             else 
	            	 return valid;
	         } 
	         
	         catch (Exception ex) 
	         {
	        	 System.out.print(ex);
	        	 return false;
	         }
	         
	        
	    }

	    public static List<Engineer> collection() 
	    {
	        return jes;
	    }
}