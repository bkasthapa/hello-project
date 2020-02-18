package bkas;

public class CopyingArraysProgram {

	public static void main(String[] args) {
	int [] arr1= new int []{2,4,6,8,10};
	int [] arr2= new int [] {1,3,5,7,9};
	for (int i =0; i<arr1.length;i++) {
		arr2[i]=arr1[i];
	}
	System.out.println("What is ups?");
	for (int i = 0; i < arr1.length; i++) {     
        System.out.print(arr1[i] + " ");    
     }     
         
     System.out.println();    
         
         
     System.out.println("New elements ");    
     for (int i = 0; i < arr2.length; i++) {     
        System.out.print(arr2[i] + " ");    
	}

	}

}
