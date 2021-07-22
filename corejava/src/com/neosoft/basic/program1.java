package com.neosoft.basic;
import java.util.Scanner;


public class program1 {
public static void main(String[] args) {
		int n, remainder=0,reversed=0;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a  number: ");
	          n = sc.nextInt();
	    int no=n;
	     while (n != 0) {
	         remainder = n % 10;
	         reversed = reversed * 10 + remainder;
	         n /= 10;
	     }
	     
	     
	     if(no == reversed) {
	         System.out.println("it is  palindrom");
	     } else{
	    	 System.out.println (" it is not palindrom" );
	     }
	}
}
	     
	
		
		
		
		

	


