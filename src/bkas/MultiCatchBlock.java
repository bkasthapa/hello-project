package bkas;

public class MultiCatchBlock {

	public static void main(String[] args) {
		 try{    
             int a[]= {10,15,20,25,30,35,40,45,50,55};    
            
           
            System.out.print(a[0]);  
            a[15]= 30/0; 
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    


	}

}
