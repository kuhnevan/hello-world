
public class HelloWorld {
	private String hello;
	private String world;
	
	public HelloWorld() {
		world = "Hello";
		hello = "World";
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
