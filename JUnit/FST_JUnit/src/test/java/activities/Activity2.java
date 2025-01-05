package activities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class Activity2 {
	@Test
	void notEnoughFunds() {

		BankAccount account = new BankAccount(9);

		assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
				"Balance must be greater than amount of withdrawal");
	}

	@Test
	void enoughFunds() {
		
		BankAccount account = new BankAccount(100);
		int expectedBalance = 0;

		assertDoesNotThrow(() -> account.withdraw(10));
		assertEquals(expectedBalance, account.withdraw(90));
	}
}
