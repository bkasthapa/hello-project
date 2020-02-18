package bkas;

public class StudentBkas {
	String name;
	String address;
	int roll_no;
	int phone_no;
		StudentBkas (String name,String address,int roll_no,int phone_no)
		{
			System.out.println(name+"\n"+address+"\n"+roll_no+"\n"+phone_no);
	}
		
	
	public static void main(String[] args) {
	StudentBkas s1= new StudentBkas("Bikash","North atlantic ave",100,25240644);
	StudentBkas s2= new StudentBkas("Bkas","Lee highway",200,26457389);
	
	
	
	
	

	}

}
