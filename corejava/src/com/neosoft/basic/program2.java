package com.neosoft.basic;

import java.util.Scanner;

public class program2 {
	 public static void printNums(int n)
	    {
	      int i, j, num=1;
	          for(i=0; i<n; i++)
	        {for(j=0; j<=i; j++)
	            {
	              
	        	 
	                System.out.print(num+ " ");
	                 
	               
	                num = num + 1;
	               
	            }
	 
	        
	            System.out.println();
	        }
	    }
	
     	 public static void main(String[] args) {
     	 	int n;
		  Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a  number: ");
	          n = sc.nextInt();
	          printNums(n);
	          
	          

	}

}
