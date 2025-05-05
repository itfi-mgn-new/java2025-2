package lesson9;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -4398172655234884981L;
	
	transient Object	zzz = new Object();
	String	family;
	String	name;
	String	patroName;
	int		age;
	Location	l;
	
	public Person(String family, String name, String patroName, int age, Location l) {
		this.family = family;
		this.name = name;
		this.patroName = patroName;
		this.age = age;
		this.l = l;
		System.err.println("Created/.....");
	}

	@Override
	public String toString() {
		return "Person [family=" + family + ", name=" + name + ", patroName=" + patroName + ", age=" + age + ", l=" + l + "]";
	}
}
