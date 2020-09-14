package tastCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindomeTest {

	@Test
	void testpalindrome() {
		System.out.println("String is a palindrome");
		Palindome palindrome = new Palindome();
		assertTrue(palindrome.isPalindrome("rotator"));
	}
	
	@Test
	void testpalindromefails() {
		System.out.println("String is a palindrome Failure!");
		Palindome palindrome = new Palindome();
		assertTrue(palindrome.isPalindrome("potatoe"));
	}
	
}
