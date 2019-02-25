package javaRiasad.riasadJava;

public enum Enum {
	JANUARY("January",31),
	FEBRUARY("FEBRUARY",28),
	MARCH("March",31),
	APRIL("April",31),
	MAY("May",31),
	JUNE("June",31),
	JULY("July",31),
	AUGUST("August",31),
	SEPTEMBOR("Septembor",31),
	OCTOBOR("Octobor",31),
	NOVEMBOR("Novembor",31),
	DECEMBOR("Decembor",31);
	
	 private static String d;
	private final String monthName;
    private final int days;
    
    
	private Enum(String monthName, int days) {
		this.monthName = monthName;
		this.days = days;
	}
	public String getMonthName() {
		return monthName;
	}
	public int getDays() {
		return days;
	}

    // order of fields matter
	public static String contains(String s )
	  {
		
	      for(Enum choice:values())
	           if (choice.getMonthName().substring(0,3).equals(s)) {
	        	   
	        	   d=choice.getMonthName()+" "+choice.getDays();
	        	
	           }

        return d;
        
	  }
	
	
      
	  
}



