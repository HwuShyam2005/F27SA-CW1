import java.util.Scanner;

/**
 * 
 * Software Development 1, Coursework 1.
 * 
 * Make sure you read the specification document on
 * Canvas in full before starting this assessment.
 * 
 */
		
		public class DegreeAdvice{
			static final int D = 40;
			static final int E = 30;
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				

		// TO SELECT WHICH DEGREE PROGRAMME
				System.out.println("Which degree programme are you studying on? (Enter CSci or CSys)");
				String degree = scan.next();
		// TO ENTER THE MARKS OBTAINED IN THE COURSE F27PX
				int F27PX;
				System.out.println("Please enter your marks obtained in F27PX");
				F27PX = scan.nextInt();
		// TO ENTER THE MARKS OBTAINED IN THE COURSE F27ID
				int F27ID;
				System.out.println("Please enter your marks obtained in F27ID");
				F27ID = scan.nextInt();
		// TO ENTER THE MARKS OBTAINED IN THE COURSE F27SA
				int F27SA;
				System.out.println("Please enter your marks obtained in F27SD");
				F27SA = scan.nextInt();
		// TO ENTER THE MARKS OBTAINED IN THE COURSE F17LP
				int F17LP;
				System.out.println("Please enter your marks obtained in F17LP");
				F17LP = scan.nextInt();

		// TO FIND YOUR AVERAGE
				double avg = (double) (F27PX + F27ID + F27SA + F17LP) / 4;
				System.out.println("Your average is " + avg+"%");

		// CRITERIA FOR COMPUTER SCIENCE
				if (degree.equals("CSci")) {
					if (F27SA < D) {System.out.println("For this semester, you have not yet met the requirements to proceed to your next year of study for the degree programme BSc ComputerScience.");}
			        else if (F27ID < D) {System.out.println("For this semester, you have not yet met the requirements to proceed to your next year of study for the degree programme BSc ComputerScience.");}
			        else if (F27PX < E) {System.out.println("For this semester, you have not yet met the requirements to proceed to your next year of study for the degree programme BSc ComputerScience.");}
				    else if (F17LP < D) {System.out.println("For this semester, you have not yet met the requirements to proceed to your next year of study for the degree programme BSc ComputerScience.");} 
				    else {System.out.println("For this semester, you have met the requirements to proceed to your next year of study for the degree programme BSc Computer Science.");}
			    }	
		// CRITERIA FOR COMPUTER SYSTEMS
				if (degree.equals("CSys")) {
					if (F27SA < D) {System.out.println("For this semester, you have not yet met the requirements to proceed to your next year of study for the degree programme BSc Computer systems.");}
					else if (F27ID < D) {System.out.println("For this semester, you have not yet met the requirements to proceed to your next year of study for the degree programme BSc Computer systems.");}
					else if (F27PX < E) {System.out.println("For this semester, you have not yet met the requirements to proceed to your next year of study for the degree programme BSc Computer systems.");}
					else if (F17LP < E) {System.out.println("For this semester, you have not yet met the requirements to proceed to your next year of study for the degree programme BSc Computer systems.");}
					else {System.out.println("For this semester, you have met the requirements to proceed to your next year of study for the degree programme Computer systems.");}

				}
			}
		

	}


