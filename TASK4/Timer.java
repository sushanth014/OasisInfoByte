package com.Internship.ExamRegistration;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Timer {
	static Scanner sc=new Scanner(System.in);
    static int marks=0;
  
  private static boolean isExamOver = false;

 public static void Java() {
    Scanner scan = new Scanner(System.in);
    int timeLimit = 15; // exam time limit in seconds
    
    // start exam
    System.out.println("The exam will start now and will last for " + timeLimit + " seconds.");
    
    // create a scheduler to end the exam after the time limit
    ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    scheduler.schedule(() -> {
      System.out.println("\n\n  * * * * * Time's up! The exam is over * * * * * * . \n\n ---> Your marks is "+marks+"\n\n LogOut Successfull");
      isExamOver = true;
    }, timeLimit, TimeUnit.SECONDS);
    
 
    while (!isExamOver){
    	System.out.println("\nQ 1. what is mean by 'JVM'  java...?\n\n1.Java variable member\n2.java virtual memory\n3.java virtual machine");
    	System.out.print("Enter Your Choice :");
    	int a=sc.nextInt();
    	if(a==3) {
    		marks++;
    	}
    	System.out.println("\nQ 2. what is mean by 'JRE'  java...?\n\n1.Java Run time Environment \n2.java Ratio Environment \n3.java java Run Evalution");
    	System.out.print("Enter Your Choice :");
    	int b=sc.nextInt();
    	if(b==1) {
    		marks++;
    	}
    	System.out.println("\nQ 3. what is mean by 'JDK'  java...?\n\n1.Java Deployment keyword \n2.java Developement kit \n3.java Distroy keyword");
    	System.out.print("Enter Your Choice :");
    	int c=sc.nextInt();
    	if(c==2) {
    		marks++;
    	}
    	
    	
    }
    
    // end the scheduler
    scheduler.shutdown();
    
    // close the scanner
    scan.close();
    }
 
 
 public static void Cpp() {
	    Scanner scan = new Scanner(System.in);
	    int timeLimit = 10; // exam time limit in seconds
	    
	    // start exam
	    System.out.println("The exam will start now and will last for " + timeLimit + " seconds.");
	    
	    // create a scheduler to end the exam after the time limit
	    ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
	    scheduler.schedule(() -> {
	      System.out.println( "\n\n  Opps!!!!!  Time's up! The exam is over.\n\nYour Total Marks is : "+marks+"\n\n LogOut Successfull");
	      isExamOver = true;
	    }, timeLimit, TimeUnit.SECONDS);
	 
	    
	 
	    while (!isExamOver){
	    	System.out.println("\nQ 1. C++  is...?\n\n1.High Level language \n2.Low level language \n3.assembl language");
	    	System.out.print("Enter Your Choice :");
	    	int a=sc.nextInt();
	    	if(a==1) {
	    		marks++;
	    	}
	    	System.out.println("\nQ 2. c++ supports both oops and pop ...?\n\n1.Yes  \n2.no");
	    	System.out.print("Enter Your Choice :");
	    	int b=sc.nextInt();
	    	if(b==1) {
	    		marks++;
	    	}
	    	System.out.println("\nQ 3.c++ have pointers ...\n\n1.True  \n2.false \n");
	    	System.out.println("Enter Your Choice :");
	    	int c=sc.nextInt();
	    	if(c==1) {
	    		marks++;
	    	}
	    	
	    }
	    
	    // end the scheduler
	    scheduler.shutdown();
	    
	    // close the scanner
	    scan.close();
	
	    }
 public static void Python() {
	    Scanner scan = new Scanner(System.in);
	    int timeLimit = 10; // exam time limit in seconds
	    
	    // start exam
	    System.out.println("The exam will start now and will last for " + timeLimit + " seconds.");
	    
	    // create a scheduler to end the exam after the time limit
	    ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
	    scheduler.schedule(() -> {
	      System.out.println("\n\n  * * * * * Time's up! The exam is over * * * * * * . \n\n ---> Your marks is "+marks+"\n\n LogOut Successfull");
	      isExamOver = true;
	    }, timeLimit, TimeUnit.SECONDS);
	    
	 
	    while (!isExamOver){
	    	System.out.println("\nQ 1.Python supports oops ..\n\n1.True \n2.False");
	    	System.out.println("Enter Your Choice :");
	    	int a=sc.nextInt();
	    	if(a==1) {
	    		marks++;
	    	}
	    	System.out.println("\nQ 2. python is easy to understand ..?\n\n1.Yes  \n2.no");
	    	System.out.println("Enter Your Choice :");
	    	int b=sc.nextInt();
	    	if(b==1) {
	    		marks++;
	    	}
	    	System.out.println("\nQ 3.does python support pointers ...\n\n1.Yes  \n2.No \n3.Maybe..");
	    	System.out.println("Enter Your Choice :");
	    	int c=sc.nextInt();
	    	if(c==2||c==3) {
	    		marks++;
	    	}

	    	
	    }
	    
	    // end the scheduler
	    scheduler.shutdown();
	    
	    // close the scanner
	    scan.close();
	    }

}