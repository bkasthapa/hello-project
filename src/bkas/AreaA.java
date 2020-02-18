package bkas;

import java.util.Scanner;

public class AreaA {
	int length;
	int breadth;
	
	AreaA (int l, int b)
	{
		length = l;
		breadth = b;		
	}	
	int returnArea()
	{
		return length*breadth;
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    int l,b;

		    System.out.println("Enter length");
		    l = s.nextInt();
		    System.out.println("Enter breadth");
		    b = s.nextInt();

		    AreaA a = new AreaA(l,b);
		    System.out.println("Area : "+a.returnArea());
	
	
	

	}

}
