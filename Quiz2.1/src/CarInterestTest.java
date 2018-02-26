import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarInterestTest {

	@Test
	void interestTest() {
		
		//a car that costs $35,000, 10% loan, for 60 months will be $743.65, total interest paid $9,618.79
		
		
		CarInterest car = new CarInterest(35000, 0, 60, 10);
		
		if (car.MonthlyPayment() != 743.6465648943916) {
			
			fail("MonthlyPayment calculation error");
			
		}
		
		else if (car.TotalSpentInterest() != 9618.793893663496) {
			
			fail("TotalInterest calculation error");
		}
		
		assertEquals(743.65, car.MonthlyPayment(), .01);
		
		assertEquals(9618.79, car.TotalSpentInterest(), .01);
	}
	
}
