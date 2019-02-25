package uTest.enumTest;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class EnumTest {
	

	@Test
	public void testAssert() {
      
		//String check = Enum.contains("Jan");
		//Enum e =new Enum("");
//		App s =new App();
//		String check =s.contains("JAN");
		//assertNotNull(Enum.MAY);
		
		//assertSame("MAY",Enum.MAY);
		/*String s = "MAY";
		
		assertNotSame("MAY",Enum.MAY);*/
		Enum m =Enum.JANUARY;
		 
	
		assertEquals("January",Enum.JANUARY.getMonthName());
	}

}
