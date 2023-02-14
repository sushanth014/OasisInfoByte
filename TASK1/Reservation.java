package com.Internship.Reservation;
import java.time.LocalDate;
import java.util.*;


public class Reservation {
	static String login_id,password,id="1234",pass="Pass@123",number;
	static String name,email,class_type,date_of_journey,start,destination,train_na,starting,destiny;
	static int class_switch,train_num,ticket_num;
	static String train_name[]= {"vandhe bharath express","Flaknuma express","godavari express"};
	
	static Scanner sc=new Scanner(System.in);
//Login here ...
	public static void login() {
		System.out.println("\n----------------Log-in-----------------");
		System.out.print("\nUser Id :");
		login_id=sc.next();
		System.out.print("Password :");
		password=sc.next();
		if(login_id.equals(id)&&password.equals(pass)) {
			System.out.println("\nLogin successfull");
			user_details();
		}
		else {
			System.out.println("\ninvalid login retry!!!");
			login();
	}
	}
	
//USER_RESEVE
	public static void user_details() {
		System.out.println("\n----Enter Details----\n");
		System.out.print("Name : ");
		name=sc.next();
		System.out.print("email :");
		email=sc.next();
		System.out.print("number :");
		number=sc.next();
		System.out.print("train number : ");
		train_num=sc.nextInt();
			switch (train_num) {
			case 1234: {
				
				train_na=train_name[0];
				break;
			}
			case 2345:{
				train_na=train_name[1];
				break;
			}
			case 3456:{
				train_na=train_name[2];
				break;
			}
			}
		System.out.println("class type\n1.AC Chair Class (CC) ...\r\n2.Sleeper Class (SL) ...\r\n3.Second Class (2S)");
		class_switch=sc.nextInt();
		switch (class_switch) {
		case 1: {
			class_type="AC Chair Class";
			break;
		}
		case 2:{
			class_type="Sleeper Class";
			break;
		}
		case 3:{
			class_type="Second Class";
			break;
		}
		}
		System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.next();
        LocalDate date = LocalDate.parse(input);
	System.out.print("Starting point:");
	start=sc.next();
	System.out.print("Destiny point:");
	destiny=sc.next();
	
System.out.println("------------------------PASSENGER DETAILS-----------------------");
System.out.println("\nyour ticket registration is done successfully below are the details of passenger and train ");
ticket_num=train_num+54321;
		System.out.println("\nTicket Number is :"+ticket_num+"\nname :"+name+"\nemail:"+email+"\nnumber:"+number+"\ntrain no:"+train_num+"\ntrain name :"+train_na+"\ntrain class :"+class_type+"\nDate :"+date+"\nstarting point:"+start+"\ndestiny :"+destiny);
	System.out.println("\n\n1.book another ticket");
	System.out.println("\n\n2.cancle ticket");
	System.out.println("\n\n3.exit ");
	int ex=sc.nextInt();
	switch (ex) {
	case 1: {
		user_details();
		break;
	}
	case 2:{
		Cancel();
		break;
	}
	case 3:{
		System.out.println("you are account logout done successfully ");
		break;
	}
	}
	}
	
//cancellation
	public static void Cancel(){
		System.out.print("enter your ticket number to cancle:");
		int a=sc.nextInt();
		if(ticket_num==a) {
			System.out.println("\n---------you are details are-------");
			System.out.println("\nTicket Number is :"+ticket_num+"\nname :"+name+"\nemail:"+email+"\nnumber:"+number+"\ntrain no:"+train_num+"\ntrain name :"+train_na+"\ntrain class :"+class_type+"\nstarting point:"+start+"\ndestiny :"+destiny);	
			System.out.println("--------------You are ticket ("+ticket_num+ ") is cancelled successfully----------");
		}
		else {
			System.out.println("enter correct ticket number :");
			Cancel();
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("----------- Welcome to Railway Registration----------- ");
		login();

}
}
