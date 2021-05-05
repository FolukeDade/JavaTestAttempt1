import java.util.Scanner;

public class Attempt1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to your grade book!!");
		
		String[] students = {"Toni", "Bryan", "Chris", "Shelby", "Alex", "Tyler", "Erin", "Ben", "Tiffany", "Sarah"};
		int [] scores = {87, 90, 80, 100, 95, 70, 65, 100, 72, 56};
		char [] grade = {'A', 'B', 'C', 'D', 'F'};
		
		int score = 90;
		// if statement
		// if student scored greater than 90; print Student scored an A
		// if student scored greater than 80 but less than or equal to 89; print Student scored a B
		// if student scored greater than 70 but less than or equal to 79; print Student scored a C
		// if student scored less than 69; print Student failed
		
		if (score >= 90 ) {
			System.out.println("Student scored an " + 'A');
		}
	
	}

}
