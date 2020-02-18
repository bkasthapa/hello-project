package driver;

public class Vechile {
	private String model;
	private String type;
	private int licenseplateno;
	private int year;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLicenseplateno() {
		return licenseplateno;
	}

	public void setLicenseplateno(int licenseplateno) {
		this.licenseplateno = licenseplateno;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Object getVe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Vechile [model=" + model + ", type=" + type + ", licenseplateno=" + licenseplateno + ", year=" + year
				+ "]";
	}

}
