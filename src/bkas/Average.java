package bkas;

import java.util.Scanner;

public class Average {
	int x;
	int y;
	int z;
	Average (int a, int b, int c)
	{
	x=a;
	y=b;
	z=c;
	}
   int getAverage()
{
	return((x+y+z)/3);

}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a,b,c;
	System.out.println("WTF a");
	a= s.nextInt();
	System.out.println("WTF b");
	b= s.nextInt();
	System.out.println("WTF c");
	c= s.nextInt();
	Average q = new Average(a,b,c);
	System.out.println("Average: "+q.getAverage());
	}

}
