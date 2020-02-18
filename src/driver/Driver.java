package driver;

public class Driver {

	private String name;
	private String address;
	private int phoneno;
	private Vechile ve;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public Vechile getVe() {
		return ve;
	}

	public void setVe(Vechile ve) {
		this.ve = ve;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", address=" + address + ", phoneno=" + phoneno + ", ve=" + ve + "]";
	}

	public Object getVehicles() {
		// TODO Auto-generated method stub
		return null;
	}

}
