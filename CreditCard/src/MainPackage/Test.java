package MainPackage;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class Test{
	@Test
	public void Valid() {
		CheckDigit test = new CheckDigit();
		String result = (String) test.CheckDigit("4246345689049834");
		assertEquals("valid", result);
	}
}