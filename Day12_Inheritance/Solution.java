package Day12_Inheritance;
import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

    Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

    public void printPerson(){
		 System.out.println( "Name: " + lastName + ", " + firstName);
         System.out.println("ID: " + idNumber); 
	}
}

class Student extends Person{
	private int[] testScores;
     
Student(String firstName, String lastName, int idNumber, int[] testScores)
    {
            super(firstName, lastName, idNumber); 
            this.testScores = testScores; 
     }

public char calculate() {
    int sum = 0;

    for (int i = 0; i < testScores.length; i++) 
         sum += testScores[i];

    int avg = sum / testScores.length;

    if (avg >= 90) 
       return 'O';
    else if (avg >= 80) 
       return 'E';
    else if (avg >= 70) 
       return 'A';
    else if (avg >= 55)
       return 'P';
    else if (avg >= 40)
       return 'D';
    else
       return 'T';
}
}

public class Solution {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		String firstName = sc.next();
		String lastName = sc.next();
		int id = sc.nextInt();
		int numScores = sc.nextInt();

		int[] testScores = new int[numScores];


		for(int i = 0; i < numScores; i++)
			testScores[i] = sc.nextInt();
		
		sc.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
    
}
}
