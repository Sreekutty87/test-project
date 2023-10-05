package projectforjunit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddition {
	
	    @Test
	    public void testSum() {
	        int number1 = 5;
	        int number2 = 10;
	        int expected = 15;
	        int result = sum(number1, number2);
	        assertEquals(expected, result);
	    }
	


	    public static int sum(int a, int b) {
	        return a + b;
	    }

}



	