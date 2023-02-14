package com.Internship.ExamRegistration;
import java.util.*;

public class Stage_two {
	static int marks=0;
	static Scanner sc=new Scanner(System.in);
                  //second Function for Timer and McCQ Language check
    static int check; 
	public static  void mcq_opt() {
		// TODO Auto-generated method stub
    	System.out.print(" * * * * * * * * * * * * * *  choose any programming language  * * * * * * * * * * * * * *\n\n 1.JAVA\n\n 2.C++\n\n 3.Python\n\n Enter Your choice :");
    	check=sc.nextInt();
    	switch (check) {
		case 1: { 
			System.out.println(".....Your Test Stated.....");
			Timer.Java();
			break;	
		}
		case 2:{
			System.out.println(".....Your Test Stated.....");
			Timer.Cpp();
			break;
		}
		case 3:{
			System.out.println(".....Your Test Stated.....");
			Timer.Python();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
    	

	}
    
    

    
    
	


}
