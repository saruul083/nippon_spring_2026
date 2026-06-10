package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxTest {
	@Test
	public void testPremiumProduct() {
		PremiumProduct tax = new PremiumProduct("Computer", 360000);
		Assertions.assertEquals(tax.taxAmount(360000), 360000 * 0.1);
	}
}
