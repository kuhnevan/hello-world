
public class HelloWorld {
	private String hello;
	private String world;
	
	public HelloWorld() {
		hello = "Hello";
		world = "World";
	}
	
	public String getHello() {
		return hello;
	}
	
	public String getWorld() {
		return world;
	}
	
	public String greeting() {
		return hello + " " + world;
	}

}
