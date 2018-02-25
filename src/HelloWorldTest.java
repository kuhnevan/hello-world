import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {
	
	HelloWorld hw;
	
	@Before
	public void setup() {
		hw = new HelloWorld();
	}
	
	@Test
	public void testGreeting() {
		assertTrue(hw.greeting().equals("Hello World"));
	}

}
