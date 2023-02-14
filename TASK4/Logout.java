package com.Internship.ExamRegistration;
import java.util.*;

public class Logout {
	public static void Log_out() {
		System.out.println("Do Want to Logout \n presss 1 to confirm");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1) {
			System.out.println("Logout Successfully...");
		}
}

}
