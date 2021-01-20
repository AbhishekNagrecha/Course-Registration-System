package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String email;
	private String courses = null;
	private int tutionbalance = 0;
	private static int costofCourse = 500;
	private String companySuffix = "xyzcompany.com"; 
	private static int id = 1000; // each time we create new student entry
	
	
	
	// Constructor: To enter student's full name and year of enrollment
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Students first Name:"); // asks us to enter  first name
		this.firstName = in.nextLine(); // submits the request
		
		System.out.println("Enter Students last Name:"); // asks us to enter  last name
		this.lastName = in.nextLine(); // submits the request
	}
		
		// Constructor to get the first and last name
		public void Email(String firstName, String lastName) {
			
			this.firstName= firstName;
			this.lastName= lastName;
	     	System.out.println("Email Created:" + this.firstName + " " + this.lastName);
	     	
	    	//combining all to generate unique emailID
	    	
	    	email = firstName.toLowerCase() + "." +  lastName.toLowerCase() + "@" + "." + companySuffix;
	    	System.out.println("Your assigned Email ID is " +email);
		
		System.out.println("\n1Fresher\n2 Sophmore\n3 Junior\n4 Senior\n Enter Students Class Year:"); // asks us to enter class Year
		this.gradeYear = in.nextInt(); // submits the request
		
		setstudentID();
		
		System.out.println("Kindly review the information");
		System.out.println("\nLegal Name: " +firstName + " " + lastName + "\nYear of study:" + gradeYear + "\nStudent ID: " +studentID);
		
	
	}
	
	// Generate Unique Student ID
	
	private void setstudentID() {
		id++; // will increament student ID starting from 1000
		
		this.studentID =  gradeYear + "" + id; // to concateneate the string
	}
	
	// Do course registration
	public void enroll() {
		do {
				System.out.print("Now enter course name and number to register(press e to exit)");
				Scanner in = new Scanner(System.in);
				String course =  in.nextLine();
				if(!course.equals("e")) {
					
					courses = courses + "\n " + course;
					tutionbalance = tutionbalance + costofCourse;
					
		   }
				else {break; }
		} while(1 != 0);
	
		System.out.println("Total registration cost is:" +tutionbalance);
		
		
	}
	
	// View account due balances
	public void viewbalance() {
		System.out.println("Amount due is: $" +tutionbalance);
		
	}
	
	// Pay the outstanding amount
	
	public void paytution() {
		viewbalance();
		System.out.println("Enter amount you want to pay: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionbalance = tutionbalance - payment;
		System.out.println("Payment made Successfully of: $" +payment);
		
		viewbalance();
		
	}
	// Display status
	
	public String  toString() {
		System.out.println("Summary:");
		return "Name: " + firstName + " " + lastName + 
				"\n Study Year:" +gradeYear+
				"\n Student ID:" +studentID+
				"\n Courses Registered for:" +courses+
				"\n Outstanding Balance:" +tutionbalance;


		
		
	}

}
