import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void sample() {
		String actual = "gmail";
		String expected = "gmail";
		Assert.assertEquals(actual, expected);
	}

}
