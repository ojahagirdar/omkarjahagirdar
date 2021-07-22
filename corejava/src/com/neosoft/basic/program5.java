package com.neosoft.basic;
import java.util.Scanner;

public class program5 {
	String studentName;
      
	int stid;
	String Course;
	int mark;
	
	public program5(String studentName, int stid, String course, int mark) {
		super();
		
		
		this.studentName = studentName;
		this.stid = stid;
		Course = course;
		this.mark = mark;
	}

	
	
	 void Show() {
		 
  System.out.println("My name is " + studentName + " and my age is " + stid+ Course);

    	}
    
   
	
	
	
	

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a  student id: ");
          int n = sc.nextInt();
  	      System.out.println("Enter a  student Name: ");
          String v = sc.next();
            System.out.println(n);
            System.out.println(v);

	}
	
}
