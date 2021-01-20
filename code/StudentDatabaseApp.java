package studentdatabaseapp;

import java.util.Scanner;

import emailapp.Email;

public class StudentDatabaseApp {
	Email eml = new Email("Abhishek" , "Nagrecha");


	public static void main(String[] args) {
		
	
		// Ask the number of new students to add
		System.out.println("Enter number of new enrollments:");
		Scanner in = new Scanner(System.in);
		int numofstudents = in.nextInt();
		Student[] students = new Student[numofstudents];

		
		// create n number of new students
		for(int n = 0; n< numofstudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			
			students[n].paytution();
			System.out.println(students[n].toString());
			
		}

	}

}
