package javaRiasad.riasadJava;

public class App {
	 public static void main( String[] args )
	    {
	        
	    	Enum []months=Enum.values();
	    	for(Enum month :months  ) {
	    		System.out.println("Month Name: "+month.getMonthName()+" "+month.getDays());
	    	}
	    	String check = Enum.contains("Mec");
	    	if (check==null) {
	    		
	    		System.out.println("Not found");
	    	}
	    	else {
	    		System.out.println(check);
	    	}
	    	 
	    		
	    	
	    	
	    	
}
}