package bkas;

public class OverridingPrograms {
	
		   //Overridden method
		   public void eat()
		   {
		      System.out.println("Human is eating");
		   }
		}
		class Boy extends OverridingPrograms{
		   //Overriding method
		   public void eat(){
		      System.out.println("Boy is eating");
		   }
		}
