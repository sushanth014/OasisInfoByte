package com.Internship.ExamRegistration;

import java.util.*;

public class ExamReg {
	static Scanner sc=new Scanner(System.in);
	
	 
//Method for Reset_Cred...

	public static void main(String[] args) {
		Stage_one.StageOne_Function();
		System.out.println("\n* EXAM TIME ONLY 15 SECONDS \n* You have to attempt 3 QUESTIONS only \n* Auto submit \n\n ");
		System.out.print("Press 1 to Begin Test ");
		int a=sc.nextInt();
			if(a==1) {
			Stage_two.mcq_opt();
			Logout.Log_out();
			}
			else {
			System.out.println("your test link failed try again!!!");
			
			}
	    }
	}

  
