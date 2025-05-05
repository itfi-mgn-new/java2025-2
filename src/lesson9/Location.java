package lesson9;

import java.io.Serializable;

public class Location implements Serializable{
	private static final long serialVersionUID = 1L;

	String	street;
	int		house;
	
	public Location(String street, int house) {
		this.street = street;
		this.house = house;
	}

	@Override
	public String toString() {
		return "Location [street=" + street + ", house=" + house + "]";
	}
}
