package tastCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumbersTest {

	@Test
	void evenNumbertest() {
		System.out.println("Boolean test number is Even");
		Numbers number = new Numbers();
		assertTrue(number.isEven(12));
	}
	
	@Test
	void evenNumbertestfails() {
		System.out.println("Boolean test number is Even failure!");
		Numbers number = new Numbers();
		assertTrue(number.isEven(5));
		;
	}
	
	
}