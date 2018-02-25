import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {
	
	@Test
	public void testGreeting() {
		assertTrue(HelloWorld.greeting().equals("Hello World"));
	}

}
