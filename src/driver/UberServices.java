package driver;

public class UberServices {

	public static void main(String[] args) {
		Driver v1 = new Driver();
		v1.setName("bikash");
		v1.setAddress("Pokhara");
		v1.setPhoneno(101202345);

		Vechile v2 = new Vechile();
		v2.setModel("ford");
		v2.setType("Fusion");
		v2.setLicenseplateno(101010101);
		v2.setYear(2016);

		v1.setVe(v2);
		Uber ub = new Uber();
		ub.drive(v1);
	}

}
