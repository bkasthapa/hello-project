package bkas;

public class TriangleParameters {
int length = 10;
int base= 5;
int height= 10;
int Area = (int) (0.5*base*height);
int Perimeter= (length+base+height);

  TriangleParameters ()
  {
	 
	  System.out.println(Area);
	  System.out.println(Perimeter);
  
  }
  
	public static void main(String[] args) {
		
	TriangleParameters t1 = new TriangleParameters();

			
	}

}
