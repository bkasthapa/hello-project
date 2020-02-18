package bkas;

public class StringComparisonExample {

	public static void main(String[] args) {
	String s = "Hello my name is bikash.";
	String s1 = "Hello my name is bikash";
	String s2 = new String("Hello my name is bikash");
	String s3= "Hello my name is bikash";
	String s4 = "Bikash";
	String s5 = "BiKasH";
	String s6 = "bikash";
	System.out.println(s.equals (s1));
	System.out.println(s.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s2.equals(s));
	
	System.out.println(s4.equals(s5));
	System.out.println(s5.equalsIgnoreCase(s6));
	System.out.println(s4.equalsIgnoreCase(s5));
	System.out.println(s4==s5);
	System.out.println(s5==s6);
	
	
	
	

	}

}
