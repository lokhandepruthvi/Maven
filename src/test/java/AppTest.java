import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.Assert;

public class AppTest {

	@Test
	public void test() {
		Test1 t=new Test1();
		String Expected="madam";
		String actual=t.palindrome(Expected);
		Assert.assertEquals(Expected,actual);
	}

}
