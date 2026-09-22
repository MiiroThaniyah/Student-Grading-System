package studentgradingsytem;
import java.util.Scanner;


public class Student {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("WELCOME TO BBC2 GRADING SYSTEM");
	// Simple Login logic
		String correct_password="admin123";
		int attempts =0;
		int maxAttempts =3;
		boolean loggedIn =false;
		
		while(!loggedIn && attempts< maxAttempts) {
			System.out.println("Please enter your admin password");
			String storedpass = scanner.nextLine();
			attempts ++;
			//Checking details
			if(storedpass.equals(correct_password)){
			loggedIn =true;
			System.out.println("Login Successful");
		   } else {
			System.out.println("Incorrect password. Attempts left: "+(maxAttempts-attempts));
		}
			
        if(attempts>=maxAttempts) {
        	System.out.println("Too many failed login attempts. Attempts left : "+(maxAttempts-attempts));
        	scanner.close();
        	return;
        }
        // DO WHILE LOOP TO GRADE THE STUDENT
        char continueEntering;
      do {
    	  System.out.println("Enter Student name");
    	  String student_name =scanner.nextLine();
    	  System.out.println("Enter the student score , a value (0-100)");
    	  int student_score = Integer.parseInt(scanner.nextLine());
    	  
    	  //Checking the score and assessing results
    	  //Ternary
    	  
    	  String results =(student_score<50) ? " FAIL" : "PASS";
    	  
    	  char grade;
    	  if (student_score>=90) {
    		  grade= 'A'; 
    	  }else if (student_score>=80) {
    		  grade='B';
    	  }else if (student_score>=70) {
    		  grade='C';
    	  }else if(student_score>=60) {
    		  grade='D';
    	  }else if(student_score>=50) {
    		  grade='E';
    	  }else {
    		  grade='F';
    	  }
           System.out.println(student_name+ " scored "+student_score+ " result is a "+results+ " grade");  
           System.out.println("Enter another student : y/Y or no");
           continueEntering= scanner.nextLine().charAt(0);
	}while(continueEntering=='Y' || continueEntering=='y');
      
      //Reference for checking marks and range grades as a reference
      
      System.out.println("\n ---Grading Scale---");
      int[]thresholds = {90,80,70,60,50};
      char[] grade = {'A','B','C','D','E'};
      for (int i =0;i<thresholds.length;i++) {
    	  System.out.println(grade[i]+" score : "+thresholds[i]+" and above ");
      }
      System.out.println("F  below 50");
      
      scanner.close();
     
	}
  }	
}