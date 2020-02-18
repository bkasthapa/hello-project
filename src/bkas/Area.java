package bkas;

public class Area {
int length;
int breadth;

public void setDim(int l, int b)
{
	length = l;
	breadth= b;		
}

public int getArea()
{
	return length*breadth;
	
}	
public static void main(String[] args) {
Area a = new Area ();
System.out.println(a.getArea());

	}

}













