package lesson16;

public class Test implements TestMBean{
	private String	name = "???";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.err.println("Name="+getName());
	}
}