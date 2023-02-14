package com.Internship.ExamRegistration;

import java.util.Scanner;

public class Stage_one {
	
									//Login and Reset Login and Password With Stage_one Function//
	
    public static void StageOne_Function() {
    	
    	  @SuppressWarnings("resource")
		Scanner Sc=new Scanner(System.in);
    	  String Email="tandra@gmail.com";
    	  String Password ="password@123";
    	 
    	  String c,d,psw,confirm_psw;
 
    	 
		System.out.println("\n * * * * * * * * * * * * * * Examination  * * * * * * * * * * * * * *\n");
		System.out.println("\nEnter Your Login Credentials to Go Further........\n");
		System.out.print("\nEnter Email : ");
		 c=Sc.next();
		System.out.print("\nEnter Password  : ");
		 d=Sc.next();
			if(Email.equals(c)&&Password.equals(d)) {
				System.out.println("\n  * * * * * * * * * * * * * * SET YOUR LOGIN CREDENTIALS * * * * * * * * * * * * * *");
				System.out.println("\n You are Email is  ::  "+Email);
			
				System.out.print("\nSet You are new   PASSWORD :  ");
				 psw =Sc.next();
				System.out.print("\nConfirm your new passoword :");
				 confirm_psw=Sc.next();
				if(psw.equals(confirm_psw)) {
					Password=psw;
					System.out.println("\n* * * * * * You are Password reset is done!!!!! * * * * * * *");
				}
				else {
					System.out.println("\npassword does not matched....!");
					StageOne_Function();
				}
				
			}
			
			
		else {
			System.out.println("\nInvalid Login Credentials...Try Again");
			StageOne_Function();
		}
			
	}
    

		

}
